package com.company;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
public class MyFrame extends JFrame{
    MyPanel panel;
    JTextField tf1;
    JMenu menu, submenu, start;
    JMenuItem i1, i2, i3, i4, i5, play;
    ImageIcon img = new ImageIcon("src/com/company/pen.png");
    BufferedImage icon;

    MyFrame(){


        this.setIconImage(img.getImage());
        tf1 = new JTextField();
        panel = new MyPanel(); // doubling menu if added
        JMenuBar mb = new JMenuBar();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("DrawMachine");



        start=new JMenu("Start");

        play=new JMenuItem("play");
        // tf1.setBounds(350,20,80,30);
       // tf1.setEditable(false);
       // menu.add(i1); menu.add(i2); menu.add(i3);
      //  submenu.add(i4); submenu.add(i5);
      //  menu.add(submenu);
        start.add(play);
       // mb.add(menu);
        mb.add(start);
        mb.setBounds(40,40,40,100);
        this.setBounds(20,20,500,500);
        this.setJMenuBar(mb);
        this.add(tf1);
        this.add(panel);
        this.pack();
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);

    }
    public MyPanel getPanel(){
        return this.panel;
    }
}
