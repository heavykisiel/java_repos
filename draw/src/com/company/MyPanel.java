package com.company;

import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel {
    public int x;
    public int y;
    private int borderX =500;
    private int borderY =500;
    public int zero =0;
    private int lenxS;
    private int lenyS;
    private int lenxD;
    private int lenyD;

    MyPanel(){
        //this.setBounds(40,40,500,500);
        this.setPreferredSize(new Dimension(500,500));

    }
    public void paint(Graphics g){
        //super.paint(g); //erase previous line if active
        if(lenxD >= borderX){
            lenxS=500;
            lenyS=lenyD - 20;
            lenxD=lenxD -borderX;
            lenyD=lenyD;
            g.drawLine(borderX,lenyS,lenxD,lenyD);

        }
        else if(lenyD >= borderY){
            lenxS=lenxD - 20;
            lenyS=500 ;
            lenxD=lenxD;
            lenyD=lenyD-borderY;
            g.drawLine(lenxS,borderY,lenxD,lenyD);
        } else if (lenxS >= borderX) {
            lenxS=0;
            lenyS=lenyD -20 ;
            lenxD=lenxD;
            lenyD=lenyD-borderY;
            g.drawLine(lenxS,borderY,lenxD,lenyD);

        } else if (lenyS >= borderY) {
            lenxS=lenxD -20;
            lenyS=0 ;
            lenxD=lenxD;
            lenyD=lenyD-borderY;
            g.drawLine(lenxS,borderY,lenxD,lenyD);

        }else {
            x += 2;
            y += 3;
            lenxD = lenxD + x;
            lenyD = lenyD + y;
            lenxS = lenxD - 30;
            lenyS = lenyD - 30; //line length
            g.drawLine(lenxS, lenyS, lenxD, lenyD);

        }

    }

}
