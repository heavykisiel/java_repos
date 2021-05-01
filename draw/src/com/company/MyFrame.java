package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static java.lang.Thread.sleep;

public class MyFrame extends JFrame  {

    MyPanel panel;
    JMenu  start;
    JMenuBar mb;
    JMenuItem i1, i2, i3, i4, i5, replay, options;
    ImageIcon img = new ImageIcon("src/com/company/pen.png");
    boolean tick = true;
    Thread loop = new Thread(
                        new Runnable() {
        @Override
        public void run() {
            while (true) {
                if (Thread.interrupted()) {
                    break;
                }
                try {
                    Main.paintPic(Main.frame);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    repaint();
                    Main.frame.removeAll();
                    throw new RuntimeException(ex);

                }

            }
        }
    }
                );

    MyFrame(){


        panel = new MyPanel(); // doubling menu if added
        mb = new JMenuBar();

        this.setIconImage(img.getImage());
        this.setTitle("DrawMachine");
        this.setIconImage(img.getImage());
        start=new JMenu("Replay");
        replay=new JMenuItem("Replay");
        options=new JMenuItem("options");
        start.add(replay);
        start.add(options);
        mb.add(start);
        mb.add(options);
        mb.setBounds(40,40,40,100);
        mb.setLayout(new FlowLayout());
        replay.addActionListener(cbListener);
        options.addActionListener(cbListener);

        this.setBounds(20,20,500,500);
        this.setJMenuBar(mb);

        this.add(panel);
        this.pack();
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(false);
    }
    public MyPanel getPanel(){
        return this.panel;
    }


    ActionListener cbListener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == replay) {

                loop.start();
                getPanel().setBackground(Color.GRAY);
                System.out.println("bb");
            }
            if (e.getSource() == options) {
                MyOptions options = new MyOptions();
               // options.setSize(400,350);
               // options.setBackground(Color.green);
                System.out.println("aa");
            }
        }
    };
}
