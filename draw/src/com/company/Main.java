package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main {


    public static void main(String[] args) throws InterruptedException {


        MyFrame frame = new MyFrame();
       while(true){
            frame.getPanel().repaint();
            Thread.sleep(1000);
        }



    }


}
