package com.company.mm;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{

    //
    Thread thread;

    static int frameWidth = 1200;
    static int frameHeight = 600;

    //
    Splash()
    {
        //
        //setSize(frameWidth, frameHeight);

        //
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        ///
        JLabel image = new JLabel(i3);
        add(image);

        //
//          setLocationRelativeTo(null);
        //
        setUndecorated(true);
        //
        setVisible(true);

        //
        thread = new Thread(this);
        thread.start();
    }

    //
    public void run()
    {
        try
        {
            //
            Thread.sleep(7000);
            //
            //new Login();
            //
            setVisible(false);
        }
        catch (Exception e)
        {

        };
    }

    //
    public static void main(String[] args) {
        Splash frame = new Splash();

        //
        for (int i = 0; i < frameHeight; i+=10)
        {
            frame.setSize(i * 2, i);
            frame.setLocationRelativeTo(null);

            //
            try
            {
                Thread.sleep(50);

            }catch (Exception e)
            {

            }

        }

    }

}
