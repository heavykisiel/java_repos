package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static boolean ticko = true;
    public static MyFrame frame;



    public static void main(String[] args) throws InterruptedException {


        frame = new MyFrame();
/*
        ticko=true;

        while(true){
            if(ticko == false){
                break;
            }
            else{
                frame.getPanel().repaint();

            }
        }
        Thread.yield();
        frame.getPanel().repaint();
            System.out.println("e");
*/

    }
    public static void paintPic(MyFrame frame) throws InterruptedException {
        ticko=true;

        while(true){
                frame.getPanel().repaint();
           // try {
           //     Thread.sleep(100);
          //  } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); // Here!
           //     throw new RuntimeException(ex);
          //  }

        }

        //frame.repaint();
      //  frame.removeAll();
    }



}
