package com.practice;

import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mywindow extends JFrame {

    private JLabel heading;
    private JLabel Mainheading;
    private JLabel clockLabel;
    public Font font = new Font("", Font.BOLD, 35);
    public Font font2 = new Font("", Font.ITALIC,45);
    private JLabel information;
    

    Mywindow() 
    { // constructor
        setTitle("My Clock");
        setSize(400, 400);
        this.createGui();
//        this.information();
        this.startClock();
        setLocation(300, 50);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createGui() 
    { // method to be called in constructor above
        Mainheading = new JLabel("This is the Local format clock");
        heading = new JLabel("My Clock");
        information = new JLabel("Hi their the time Currently is : ");
        clockLabel = new JLabel("Clock");
        

        Mainheading.setFont(font2);
        heading.setFont(font);
        clockLabel.setFont(font);
        information.setFont(font);
        
        

        this.setLayout(new GridLayout(4, 1));
        this.add(Mainheading);
        this.add(heading);
        this.add(information);
        this.add(clockLabel);
        
    }
    
    
  

    public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dateTime = new Date().toLocaleString();
                             
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
    
    
 
    public static void main(String[] args) {
        new Mywindow();
    }
}
