package com.company.mm;

import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable{

    Thread thread;

    //
    JLabel l1 = null, l2 = null, l3 = null, l4 = null, l5 = null, l6 = null, l7 = null, l8 = null, l9 = null, l10 = null;
    JLabel[] arr_label = {l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};

    //
    JLabel caption;

    //
    CheckHotels()
    {
        //
        int frameWidth = 800;
        int frameHeight = 600;

        //
        caption = new JLabel();
        caption.setBounds(50,500,1000,70);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 40));
        caption.setForeground(Color.WHITE);
        add(caption);

        //
        ImageIcon i1 = null, i2 = null, i3 = null, i4 = null, i5 = null, i6 = null, i7 = null, i8 = null, i9 = null, i10 = null;
        ImageIcon[] arr_image = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};

        //
        Image j1 = null, j2 = null, j3 = null, j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null, j10 = null;
        Image[] arr_image2 = {j1, j2, j3, j4, j5, j6, j7, j8, j9, j10};

        //
        ImageIcon k1 = null, k2 = null, k3 = null, k4 = null, k5 = null, k6 = null, k7 = null, k8 = null, k9 = null, k10 = null;
        ImageIcon[] arr_image3 = {k1, k2, k3, k4, k5, k6, k7, k8, k9, k10};

        //
        for (int i = 0; i < 10; i++)
        {
            ///
            arr_image[i] = new ImageIcon(ClassLoader.getSystemResource("icon/hotel"+(i + 1)+".jpg"));
            arr_image2[i] = arr_image[i].getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_DEFAULT);
            arr_image3[i] = new ImageIcon(arr_image2[i]);
            arr_label[i] = new JLabel(arr_image3[i]);
            arr_label[i].setBounds(0,0,frameWidth,frameHeight);
            add(arr_label[i]);
        }

        //
        thread = new Thread(this);
        thread.start();

        //
//        setBounds(500,200, frameWidth, frameHeight);
        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);
        //
        setVisible(true);
    }

    ///
    public void run()
    {
        String[] text_hotelName = {"JW Marriott", "Madarin Oriental Hotel", "Four Seasons Hotel", "Raddisson Blue Hotel", "Classio Hotel", "The bay Club Hotel", "Breeze Blow Hotel", "The Taj Hotel", "Happy Morning Motel", "River View Hotel"};
        try
        {
            //
            for (int i = 0; i < 10; i++)
            {
                //
                arr_label[i].setVisible(true);
                //
                caption.setText(text_hotelName[i]);
                //
                Thread.sleep(2500);
                arr_label[i].setVisible(false);
            }


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    ///
    public static void main(String[] args) {

        //
        new CheckHotels();

    }
}
