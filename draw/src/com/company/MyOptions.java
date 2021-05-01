package com.company;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;

public class MyOptions extends WindowAdapter{



        ImageIcon img = new ImageIcon("src/com/company/pen.png");

        JLabel xFactorT, yFactorT,xdestT,ydestT, xStartT,yStartT;
        JTextArea xFactorV, yFactorV, xdestV,ydestV,xStartv,yStartV;
        JFrame f;
        WindowAdapter s;
        JButton bA, bC;


    MyOptions(){
            f=new JFrame();
            bA=new JButton("Accept");
            bC=new JButton("Cancel");

            xFactorT = new JLabel("XFactor value: ");
            yFactorT = new JLabel("YFactor value: ");
            xdestT = new JLabel("XDestination val: ");
            ydestT = new JLabel("YDestination val: ");
            xStartT = new JLabel("XStart val: ");
            yStartT = new JLabel("YStart val: ");

            xFactorV = new JTextArea(String.valueOf(Main.frame.getPanel().getIncX()));
            yFactorV = new JTextArea(String.valueOf(Main.frame.getPanel().getIncY()));
            xdestV= new JTextArea(String.valueOf(Main.frame.getPanel().getLenxD()));
            ydestV = new JTextArea(String.valueOf(Main.frame.getPanel().getLenyD()));
            xStartv= new JTextArea(String.valueOf(Main.frame.getPanel().getLenxS()));
            yStartV = new JTextArea(String.valueOf(Main.frame.getPanel().getLenyS()));

            bA.setBounds(50,350,95,30);
            bC.setBounds(160,350,95,30);
            xFactorV.setBounds(150,20,50,30);
            yFactorV.setBounds(150,60,50,30);
            xdestV.setBounds(150,100,50,30);
            ydestV.setBounds(150,140,50,30);
            xStartv.setBounds(150,180,50,30);
            yStartV.setBounds(150,220,50,30);
                bA.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if (e.getSource() == bA) {
                        int i = Integer.parseInt( xFactorV.getText());
                        Main.frame.getPanel().setIncX(i);
                        int j = Integer.parseInt( yFactorV.getText());
                        Main.frame.getPanel().setIncY(j);
                    }
                }
                });
        bC.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == bC) {
                    f.dispose();
                    System.out.println("bC");
                    }
                }

            });
            xFactorT.setBounds(20,20,100,20);
            yFactorT.setBounds(20,60,100,20);
            xdestT.setBounds(20,100,100,20);
            ydestT.setBounds(20,140,100,20);
            xStartT.setBounds(20,180,100,20);
            yStartT.setBounds(20,220,100,20);
            f.add(bA);
            f.add(bC);
            f.add(xFactorV);
            f.add(yFactorV);
            f.add(xFactorT);
            f.add(yFactorT);
            f.add(xdestT);
            f.add(ydestT);
            f.add(xdestV);
            f.add(ydestV);
            f.add(xStartT);
            f.add(yStartT);
            f.add(xStartv);
            f.add(yStartV);
            f.setSize(400,500);
            f.setLayout(null);
            f.setVisible(true);


    }



}
