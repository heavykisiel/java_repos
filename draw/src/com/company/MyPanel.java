package com.company;

import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel {
    public int x;
    public int y;
    private int incX=1; // narazie niestety trzeba zmieniać ręcznie :/
    private int incY=3; // tu też
    private int borderX =500;
    private int borderY =500;

    private int lenxS;
    private int lenyS;
    private int lenxD;
    private int lenyD;
    private int algonum=3; // tu też ręcznie
    /*
    algo1:
       - dla incX=1 i  incY=1 tworzy bardzo ciekawy i symetryczny wzór czerwno zielony, po czasie na czerwonej stronie postają wzory
       - dla incX=1 i  incY=2 tworzy żółto-zielony ogień
       - dla incX=1 i  incY=3 to samo co wyżej

       - dla incX=2 i  incY=1 to samo co wyżej
       - dla incX=2 i  incY=2 to samo co wyżej
       - dla incX=2 i  incY=3 to samo co wyżej

    algo2:
     - dla incX=1 i  incY=1 tworzy bardzo ciekawy i symetryczny wzór czerwno żółty
     - dla incX=1 i  incY=2 tworzy potencjanie ciekawy lecz niedorenderowany obraz
     - dla incX=1 i  incY=3 podobnie jak wyżej
     - dla incX=1 i  incY o wysokiej wartopści powstaje żółtoczerwony równoległobok np 100

     - dla incX=2 i  incY=1 tworzy żółty obraz kreski
     - dla incX=3 i  incY=1 tworzy żółty obraz  drogi
     - dla incX=4 i  incY=1 kolejny żółty obraz
     - prawdopodobnie im większe incX tym bardziej żółty obraz

    algo3:
     - dla incX=1 i  incY=1 tworzy taką fajną piramide z lotu ptaka
     - dla incX=1 i  incY=2 tworzy trójkąt, który wygląda jak piramida nie z perspektywy człowieka
     - dla incX=1 i  incY=3 tworzy obraz podobny do poprzedniego, robi półtorej piramidy
     - dla incX=1 i  incY=4 tworzy cztery niesymetryczne względem siebie trójkąty

     - dla incX=2 i  incY=1 tworzy obraz trudny do zinterpretowania jednak dość ciekawy
     - dla incX=3 i  incY=1 tworzy obraz z trzema zaciemnionymi miejscami a nie dwoma
     - dla incX=4 i  incY=1 tworzy mało interesującą kratę

     - dla incX=2 i  incY=2 tworzy piramidę w szerszej kracie
     - dla incX=3 i  incY=3 tworzy piramidę z wzorami błyskawicy
     - dla incX=4 i  incY=4 tworzy piramidę z szerszą kratką niż wcześniej
     - przy większych liczbach incX == incY takie same piramidy tylko krtki postawione są rzadziej

     - dla incX=2 i  incY=3 tworzy 3 niesymetryczne trójkatky nachodzące na siebie
     - dla incX=2 i  incY=4 tworzy podobną piramidę co dla wartości inc=1 i incy=2
     - dla incX=2 i  incY=5 tworzy 4 niesymetryczne trójkatky nachodzące na siebie

     - dla incX=3 i  incY=4 trudno wychwycić cokolwiek
     - dla incX=3 i  incY=5 trudno wychwycić cokolwiek

     */


    MyPanel(){
        //this.setBounds(40,40,500,500);
        this.setPreferredSize(new Dimension(500,500));

    }
    public void paint(Graphics g){
        //super.paint(g); //erase previous line if active
        if(getAlgonum() ==1) {


            if (getLenxD() >= borderX) {
                setLenxS(500);
                setLenyS(getLenyD() - 20);
                setLenxD(getLenxD() - borderX);
                setLenyD(getLenyD() + 20);
                g.setColor(Color.YELLOW);
                g.drawLine(borderX, getLenyS(), getLenxD(), getLenyD());

            } else if (getLenyD() >= borderY) {
                setLenxS(getLenxD() - 20);
                setLenyS(500);
                setLenxD(getLenxD() + 20);
                setLenyD(getLenyD() - borderY);
                g.setColor(Color.red);
                g.drawLine(getLenxS(), borderY, getLenxD(), getLenyD());
            } else if (getLenxS() >= borderX) {
                setLenxS(0);
                setLenyS(getLenyD() - 20);
                setLenxD(getLenxD() - borderX);
                setLenyD(getLenyD() + 20);

                g.setColor(Color.BLUE);
                g.drawLine(getLenxS(), borderY, getLenxD(), getLenyD());


            } else if (getLenyS() >= borderY) {
                setLenxS(getLenxD() - 20);
                setLenyS(0);
                setLenxD(getLenxD() + 20);
                setLenyD(getLenyD() - borderY);
                g.setColor(Color.GREEN);
                g.drawLine(getLenxS(), borderY, getLenxD(), getLenyD());

            } else {
                x += getIncX();
                y += getIncY();
                setLenxD(getLenxD() + x);
                setLenyD(getLenyD() + y); //yfactor
                setLenxS(getLenxD() - 30);
                setLenyS(getLenyD() - 30); //line length
                g.setColor(Color.magenta);
                g.drawLine(getLenxS(), getLenyS(), getLenxD(), getLenyD());
            }
        } else if (getAlgonum() == 2) {
            if (getLenxD() >= borderX) {
                setLenxS(500);
                setLenyS(getLenyD() - 20);
                setLenxD(0);
                setLenyD(getLenyD() + 20);
                g.setColor(Color.YELLOW);
                g.drawLine(borderX, getLenyS(), getLenxD(), getLenyD());


            } else if (getLenyD() >= borderY) {
                setLenxS(getLenxD() - 20);
                setLenyS(500);
                setLenxD(getLenxD() + 20);
                setLenyD(0);
                g.setColor(Color.red);
                g.drawLine(getLenxS(), borderY, getLenxD(), getLenyD());
            } else if (getLenxS() >= borderX) {
                setLenxS(0);
                setLenyS(getLenyD() - 20);
                setLenxD(getLenxD() - borderX);
                setLenyD(getLenyD() + 20);

                g.setColor(Color.BLUE);
                g.drawLine(getLenxS(), borderY, getLenxD(), getLenyD());


            } else if (getLenyS() >= borderY) {
                setLenxS(getLenxD() - 20);
                setLenyS(0);
                setLenxD(getLenxD() + 20);
                setLenyD(getLenyD() - borderY);
                g.setColor(Color.GREEN);
                g.drawLine(getLenxS(), borderY, getLenxD(), getLenyD());

            } else {
                x += getIncX();
                y += getIncY();
                setLenxD(getLenxD() + x);
                setLenyD(getLenyD() + y); //yfactor
                setLenxS(getLenxD() - 30);
                setLenyS(getLenyD() - 30); //line length
                g.setColor(Color.magenta);
                g.drawLine(getLenxS(), getLenyS(), getLenxD(), getLenyD());
            }

        }else if(getAlgonum() ==3){
            if(getLenxD() >= borderX){
                setLenxS(500);
                setLenyS(getLenyD() - 20);
                setLenxD(getLenxD() -borderX);
                setLenyD(getLenyD());
                g.drawLine(borderX, getLenyS(), getLenxD(), getLenyD());

            }
            else if(getLenyD() >= borderY){
                setLenxS(getLenxD() - 20);
                setLenyS(500);
                setLenxD(getLenxD());
                setLenyD(getLenyD() -borderY);
                g.drawLine(getLenxS(),borderY, getLenxD(), getLenyD());
            } else if (getLenxS() >= borderX) {
                setLenxS(0);
                setLenyS(getLenyD() -20);
                setLenxD(getLenxD());
                setLenyD(getLenyD() -borderY);
                g.drawLine(getLenxS(),borderY, getLenxD(), getLenyD());

            } else if (getLenyS() >= borderY) {
                setLenxS(getLenxD() -20);
                setLenyS(0);
                setLenxD(getLenxD());
                setLenyD(getLenyD() -borderY);
                g.drawLine(getLenxS(),borderY, getLenxD(), getLenyD());

            }else {
                x += getIncX();
                y += getIncY();
                setLenxD(getLenxD() + x);
                setLenyD(getLenyD() + y);
                setLenxS(getLenxD() - 30);
                setLenyS(getLenyD() - 30); //line length
                g.drawLine(getLenxS(), getLenyS(), getLenxD(), getLenyD());

            }

        }

    }

    public int getIncX() {
        return incX;
    }

    public void setIncX(int incX) {
        this.incX = incX;
    }

    public int getIncY() {
        return incY;
    }

    public void setIncY(int incY) {
        this.incY = incY;
    }

    public int getLenxS() {
        return lenxS;
    }

    public void setLenxS(int lenxS) {
        this.lenxS = lenxS;
    }

    public int getLenyS() {
        return lenyS;
    }

    public void setLenyS(int lenyS) {
        this.lenyS = lenyS;
    }

    public int getLenxD() {
        return lenxD;
    }

    public void setLenxD(int lenxD) {
        this.lenxD = lenxD;
    }

    public int getLenyD() {
        return lenyD;
    }

    public void setLenyD(int lenyD) {
        this.lenyD = lenyD;
    }

    public int getAlgonum() {
        return algonum;
    }

    public void setAlgonum(int algonum) {
        this.algonum = algonum;
    }
}
