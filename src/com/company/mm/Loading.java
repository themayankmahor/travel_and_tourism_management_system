package com.company.mm;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{

    //
    Thread thread;
    //
    JProgressBar progressBar;

    //
    String username;

    //
    Loading(String username)
    {
        //
        this.username = username;

        //
        thread = new Thread(this);
        //
        int frameWidth = 650;
        int frameHeight = 400;

        //
        getContentPane().setBackground(Color.WHITE);
        //
        setLayout(null);


        ///
        JLabel text_title = new JLabel("Travel And Tourism Application");
        text_title.setBounds(50,20,600,40);
        text_title.setForeground(Color.BLUE);
        text_title.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text_title);


        ///
        progressBar = new JProgressBar();
        progressBar.setBounds(160,100,300,35);
        progressBar.setStringPainted(true);
        add(progressBar);


        ///
        JLabel text_loading = new JLabel("Loading Please Wait...");
        text_loading.setBounds(230,140,200,30);
        text_loading.setForeground(Color.RED);
        text_loading.setFont(new Font("Raleway", Font.BOLD, 16));
        add(text_loading);


        ///
        JLabel text_username = new JLabel("Welcome " + username);
        text_username.setBounds(20,310,400,40);
        text_username.setForeground(Color.RED);
        text_username.setFont(new Font("Raleway", Font.BOLD, 16));
        add(text_username);


        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);
        //
        thread.start();
        //
        setVisible(true);
    };

    //
    public void run()
    {
        try{
            //
            for (int i = 1; i <= 101; i++)
            {
                int max = progressBar.getMaximum();     //100
                int value = progressBar.getValue();     //cur value

                //
                if (value < max)
                {
                    progressBar.setValue(progressBar.getValue() + 1);
                }
                else
                {
                    //
                    setVisible(false);
                    //
                    new Dashboard(username);
                }

                Thread.sleep(50);
            }
        }
        catch (Exception e)
        {

        }
    }


    public static void main(String[] args) {

        new Loading("");
    }

}
