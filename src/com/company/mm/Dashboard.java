package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    //
    JButton button_personalDetails, button_updateDetails, button_viewDetails, button_deleteDetails, button_checkPackage,
            button_bookPackage, button_viewPackage, button_viewHotels, button_bookHotels, button_viewBookedHotels, button_destinations,
            button_payment, button_calculator;

    //
    String username;

    //
    Dashboard(String username)
    {
        this.username = username;
        //
//        int frameWidth = 1600;
//        int frameHeight = 1000;

        //GET WINDOW DIMENSIONS (Width, Height)
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        //
        setLayout(null);


        ///
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(new Color(0,0,102));
        panel1.setBounds(0,0,screen.width, 65);
        add(panel1);


        ///
        JLabel text_heading = new JLabel("Dashboard");
        text_heading.setBounds(50,10,300,40);
        text_heading.setForeground(Color.WHITE);
        text_heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        panel1.add(text_heading);

        ///
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(new Color(0,0,102));
        panel2.setBounds(0,65,300, screen.height);
        add(panel2);

        ///
        button_personalDetails = new JButton("Add Personal Details");
        button_personalDetails.setBounds(0,0,panel2.getWidth(),50);
        button_personalDetails.setBackground(new Color(0,0,102));
        button_personalDetails.setForeground(Color.WHITE);
        button_personalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_personalDetails.setMargin(new Insets(0,0,0,60));
        button_personalDetails.addActionListener(this);
        panel2.add(button_personalDetails);


        ///
        button_updateDetails = new JButton("Update Personal Details");
        button_updateDetails.setBounds(0,50,panel2.getWidth(),50);
        button_updateDetails.setBackground(new Color(0,0,102));
        button_updateDetails.setForeground(Color.WHITE);
        button_updateDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_updateDetails.setMargin(new Insets(0,0,0,30));
        button_updateDetails.addActionListener(this);
        panel2.add(button_updateDetails);


        ///
        button_viewDetails = new JButton("View Personal Details");
        button_viewDetails.setBounds(0,100,panel2.getWidth(),50);
        button_viewDetails.setBackground(new Color(0,0,102));
        button_viewDetails.setForeground(Color.WHITE);
        button_viewDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_viewDetails.setMargin(new Insets(0,0,0,60));
        button_viewDetails.addActionListener(this);
        panel2.add(button_viewDetails);


        ///
        button_deleteDetails = new JButton("Delete Personal Details");
        button_deleteDetails.setBounds(0,150,panel2.getWidth(),50);
        button_deleteDetails.setBackground(new Color(0,0,102));
        button_deleteDetails.setForeground(Color.WHITE);
        button_deleteDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_deleteDetails.setMargin(new Insets(0,0,0,40));
        panel2.add(button_deleteDetails);


        ///
        button_checkPackage = new JButton("Check Packages");
        button_checkPackage.setBounds(0,200,panel2.getWidth(),50);
        button_checkPackage.setBackground(new Color(0,0,102));
        button_checkPackage.setForeground(Color.WHITE);
        button_checkPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_checkPackage.setMargin(new Insets(0,0,0,100));
        button_checkPackage.addActionListener(this);
        panel2.add(button_checkPackage);

        ///
        button_bookPackage = new JButton("Book Package");
        button_bookPackage.setBounds(0,250,panel2.getWidth(),50);
        button_bookPackage.setBackground(new Color(0,0,102));
        button_bookPackage.setForeground(Color.WHITE);
        button_bookPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_bookPackage.setMargin(new Insets(0,0,0,120));
        button_bookPackage.addActionListener(this);
        panel2.add(button_bookPackage);

        ///
        button_viewPackage = new JButton("View Package");
        button_viewPackage.setBounds(0,300,panel2.getWidth(),50);
        button_viewPackage.setBackground(new Color(0,0,102));
        button_viewPackage.setForeground(Color.WHITE);
        button_viewPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_viewPackage.setMargin(new Insets(0,0,0,120));
        button_viewPackage.addActionListener(this);
        panel2.add(button_viewPackage);

        ///
        button_viewHotels = new JButton("View Hotels");
        button_viewHotels.setBounds(0,350,panel2.getWidth(),50);
        button_viewHotels.setBackground(new Color(0,0,102));
        button_viewHotels.setForeground(Color.WHITE);
        button_viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_viewHotels.setMargin(new Insets(0,0,0,130));
        button_viewHotels.addActionListener(this);
        panel2.add(button_viewHotels);

        ///
        button_bookHotels = new JButton("Book Hotel");
        button_bookHotels.setBounds(0,400,panel2.getWidth(),50);
        button_bookHotels.setBackground(new Color(0,0,102));
        button_bookHotels.setForeground(Color.WHITE);
        button_bookHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_bookHotels.setMargin(new Insets(0,0,0,130));
        button_bookHotels.addActionListener(this);
        panel2.add(button_bookHotels);


        ///
        button_viewBookedHotels = new JButton("View Book Hotel");
        button_viewBookedHotels.setBounds(0,450,panel2.getWidth(),50);
        button_viewBookedHotels.setBackground(new Color(0,0,102));
        button_viewBookedHotels.setForeground(Color.WHITE);
        button_viewBookedHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_viewBookedHotels.setMargin(new Insets(0,0,0,90));
        button_viewBookedHotels.addActionListener(this);
        panel2.add(button_viewBookedHotels);


        ///
        button_destinations = new JButton("Destinations");
        button_destinations.setBounds(0,500,panel2.getWidth(),50);
        button_destinations.setBackground(new Color(0,0,102));
        button_destinations.setForeground(Color.WHITE);
        button_destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_destinations.setMargin(new Insets(0,0,0,120));
        button_destinations.addActionListener(this);
        panel2.add(button_destinations);


        ///
        button_payment = new JButton("Payments");
        button_payment.setBounds(0,550,panel2.getWidth(),50);
        button_payment.setBackground(new Color(0,0,102));
        button_payment.setForeground(Color.WHITE);
        button_payment.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_payment.setMargin(new Insets(0,0,0,140));
        button_payment.addActionListener(this);
        panel2.add(button_payment);


        ///
        button_calculator = new JButton("Calculator");
        button_calculator.setBounds(0,600,panel2.getWidth(),50);
        button_calculator.setBackground(new Color(0,0,102));
        button_calculator.setForeground(Color.WHITE);
        button_calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        button_calculator.setMargin(new Insets(0,0,0,140));
        button_calculator.addActionListener(this);
        panel2.add(button_calculator);

        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(screen.width, screen.height, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        //
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,screen.width,screen.height);
        add(image);

        ///
        JLabel text_title = new JLabel("Travel and Tourism Management System");
        text_title.setBounds(400, 70, 1000,70);
        text_title.setForeground(Color.WHITE);
        text_title.setFont(new Font("Ralewat", Font.PLAIN, 50));
        image.add(text_title);

        //
        //setSize(frameWidth, frameHeight);
        setExtendedState(JFrame.MAXIMIZED_BOTH);            // for max screen
        //
        setVisible(true);
    }

    ///
    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_personalDetails)
        {
            //
            new AddCustomer(username);
        }
        else if (ae.getSource() == button_viewDetails)
        {
            //
            new ViewCustomer(username);
        }
        else if (ae.getSource() == button_updateDetails)
        {
            //
            new UpdateCustomer(username);
        }
        else if (ae.getSource() == button_checkPackage)
        {
            //
            new CheckPackage();
        }
        else if (ae.getSource() == button_bookPackage)
        {
            //
            new BookPackage(username);
        }
        else if (ae.getSource() == button_viewPackage)
        {
            //
            new ViewPackage(username);
        }
        else if (ae.getSource() == button_viewHotels)
        {
            //
            new CheckHotels();
        }
        else if (ae.getSource() == button_destinations)
        {
            //
            new Destinations();
        }
        else if (ae.getSource() == button_bookHotels)
        {
            //
            new BookHotel(username);
        }
        else if (ae.getSource() == button_viewBookedHotels)
        {
            //
            new ViewBookedHotel(username);
        }
        else if (ae.getSource() == button_payment)
        {
            //
            new Payment();
        }
        else if (ae.getSource() == button_calculator)
        {
            //
            try
            {
                //
                Runtime.getRuntime().exec("calc.exe");

            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    //
    public static void main(String[] args) {

        //
        new Dashboard("");
    }
}
