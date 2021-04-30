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
        this.setPreferredSize(new Dimension(this.borderX,this.borderY));

    }
    public void paint(Graphics g){
        super.paint(g);

        if(zero == 0){
            int lenxS=9+x;
            int lenyS=3+y;
            int lenxD=20+x;
            int lenyD=200+y;
            zero++;
        }

        if(lenxD >= borderX){
            lenxS=500;
            lenyS=lenyD - 20;
            lenxD=lenxD+x;
            lenyD=lenyD+y-500;
        }
        else if(lenyD >= borderY){
            lenxS=lenxD - 20;
            lenyS=500 ;
            lenxD=lenxD+x;
            lenyD=lenyD+y-500;

        }else{
            x+=20;
            y+=20;
        }
        lenxD=lenxD+x;
        lenyD=lenyD+y;
        lenxS=lenxD - 20;
        lenyS=lenyD - 20;
            g.drawLine(lenxS,lenyS,lenxD,lenyD);






    }

}
