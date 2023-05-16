package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payment extends JFrame implements ActionListener {

    //
    JButton button_pay, button_back;

    //
    Payment()
    {
        //
        int frameWidth = 800;
        int frameHeight = 600;


        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,frameWidth, frameHeight);
        add(image);

        ///
        button_pay = new JButton("Pay");
        button_pay.setBounds(420,0,80,40);
        button_pay.addActionListener(this);
        image.add(button_pay);

        ///
        button_back = new JButton("Back");
        button_back.setBounds(520,0,80,40);
        button_back.addActionListener(this);
        image.add(button_back);

        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);
        //
        setVisible(true);
    }


    ///
    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_pay)
        {
            //
            setVisible(false);
            //
            new Paytm();
        }
        else
        {
            //
            setVisible(false);
        }
    }


    ///
    public static void main(String[] args) {

        new Payment();
    }
}
