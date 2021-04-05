package com.company;
import javax.swing.*;
public class Main {

    static int kingPositionC,getKingPositionL;
    static String chessBoard[][]={
            {"r","k","b","q","a","b","k","r"},
            {"p","p","p","p","p","p","p","p"},
            {" "," "," "," "," "," ","P"," "},
            {" "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "},
            {"P","P","P","P","P","P","P","P"},
            {"R","K","B","Q","A","B","K","R"}};
    /*
        piece = p
        king= a
        rook = r
        knight = k
        bishop = b
        queen = q
     */


    public static void main(String[] args) {

        JFrame f = new JFrame("Chess");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UserI ui = new UserI();
        f.add(ui);
        f.setSize(500,500);
        f.setVisible(true);
        possibleMoves();
        System.out.println(possibleMoves());

    }
    public static String possibleMoves(){
        String list = "";
        for(int i=0;i<64;i++){
            switch(chessBoard[i/8][i%8]){
                case "p": list+=possibleP(i);
                    break;
                case "R": list+=possibleR(i);
                    break;
                case "K": list+=possibleK(i);
                    break;
                case "B": list+=possibleB(i);
                    break;
                case "Q": list+=possibleQ(i);
                    break;
               // case "A": list+=possibleA(i);
               //    break;
            }
        }
        return list;
    }
    public static String possibleP(int i){
        String list="";
        return list;
    }
    public static String possibleR(int i){
        String list="";
        return list;
    }
    public static String possibleK(int i){
        String list="";
        return list;
    }
    public static String possibleB(int i){
        String list="";
        return list;
    }
    public static String possibleQ(int i){
        String list="", oldPiece;
        int r=i/8, c = i%8;
        int temp =1;
        for(int j=-1;j<=1;j++){
            for(int k=-1;k<=1;k++){
                try{
                    while(" ".equals(chessBoard[r+temp*j][c+temp*k])){
                        oldPiece=chessBoard[r+temp*j][c+temp*k];
                        chessBoard[r][c] = " ";
                        chessBoard[r+temp*j][c+temp*k] = "Q";
                        if (kingSafe()) {
                            list = list + r + c + (r+temp*j) + (c+temp*k) + oldPiece;

                        }
                        chessBoard[r][c] = "Q";
                        chessBoard[r+temp*j][c+temp*k]=oldPiece;
                        temp++;
                    }
                    if(Character.isLowerCase(chessBoard[r+temp*j][c+temp*c].charAt(0))){
                        oldPiece=chessBoard[r+temp*j][c+temp*k];
                        chessBoard[r][c] = " ";
                        chessBoard[r+temp*j][c+temp*k] = "Q";
                        if (kingSafe()) {
                            list = list + r + c + (r+temp*j) + (c+temp*k) + oldPiece;

                        }
                        chessBoard[r][c] = "Q";
                        chessBoard[r+temp*j][c+temp*k]=oldPiece;

                    }

                }catch(Exception e){

                }
                temp=1;
            }
        }



        return list;
    }
    public static String possibleA(int i){
        String list="", oldPiece;
        int r=i/8, c = i%8;
        for(int y=0;y<9;y++){
            if(y!=4){
                try {


                    if (Character.isLowerCase(chessBoard[r - 1+ y / 3][c - 1 + y % 3].charAt(0)) || " ".equals(chessBoard[r - 1 + y / 3][c - 1 + y % 3])) {
                        oldPiece = chessBoard[r - 1 + y/3][c - 1 + y % 3];
                        chessBoard[r][c] = " ";
                        chessBoard[r - 1 + y / 3][c - 1 + y % 3] = "A";
                        int kingTemp = kingPositionC;
                        kingPositionC = i + (y / 3) * 8 + y % 3 - 9;
                        if (kingSafe()) {
                            list = list + r + c + (r - 1 + y / 3) + (c - 1 + y % 3) + oldPiece;

                        }
                        chessBoard[r][c] = "A";
                        chessBoard[r - 1 + y / 3][c - 1 + y % 3] = oldPiece;
                        kingPositionC = kingTemp;

                    }
                }catch (Exception e){

                }
            }
        }
        //add castling
        return list;
    }
    public static boolean kingSafe(){
        return true;
    }
}
