package com.company;
import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame{
    MyPanel panel = new MyPanel();
    MyFrame(){
        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLayout(null);
        this.setVisible(true);
    }
    public MyPanel getPanel(){
        return panel;
    }
}
