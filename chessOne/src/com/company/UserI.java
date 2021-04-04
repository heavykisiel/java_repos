package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UserI extends JPanel implements MouseListener, MouseMotionListener {
        static int x=0,y=0;
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            this.setBackground(Color.lightGray);
            this.addMouseListener(this);
            this.addMouseMotionListener(this);

            g.setColor(Color.BLUE);
            g.fillRect(x-20, y-20, 40, 40);
            g.setColor(new Color(190,81,215));
            g.fillRect(40, 20, 80, 50);
            g.drawString("Eoo", x,y);
            Image chessPieceImage;
            chessPieceImage=new ImageIcon("ChessPieces.png").getImage();
            g.drawImage(chessPieceImage,x,0,x+100,100,x,0,x+100,100, this);

        }
        @Override
        public void mouseMoved(MouseEvent e){
            x=e.getX();
            y=e.getY();
            repaint();
        }
        @Override
        public void mousePressed(MouseEvent e){

        }
        @Override
        public void mouseReleased(MouseEvent e){

        }
        @Override
        public void mouseClicked(MouseEvent e){
            x=e.getX();
            y=e.getY();
            repaint();

        }
        @Override
        public void mouseDragged(MouseEvent e){

        }
        @Override
        public void mouseEntered(MouseEvent e){

        }
        @Override
        public void mouseExited(MouseEvent e){

        }


}
