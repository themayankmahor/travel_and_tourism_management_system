package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewBookedHotel extends JFrame implements ActionListener {

    //
    JButton button_back;

    //
    ViewBookedHotel(String username)
    {
        //
        int frameWidth = 1000;
        int frameHeight = 600;

        //
        setLayout(null);

        //
        getContentPane().setBackground(Color.WHITE);


        ///
        JLabel text_title = new JLabel("VIEW BOOKED HOTEL DETAILS");
        text_title.setFont(new Font("tahoma", Font.BOLD, 20));
        text_title.setBounds(60,0,400,30);
        add(text_title);


        ///
        JLabel text_labelUsername = new JLabel("Username");
        text_labelUsername.setBounds(30,50,150,25);
        add(text_labelUsername);

        ///
        JLabel text_username = new JLabel();
        text_username.setBounds(220,50,150,25);
        add(text_username);


        ///
        JLabel text_labelHotelName = new JLabel("Hotel Name");
        text_labelHotelName.setBounds(30,90,150,25);
        add(text_labelHotelName);

        ///
        JLabel text_hotelName = new JLabel();
        text_hotelName.setBounds(220,90,150,25);
        add(text_hotelName);


        ///
        JLabel text_labelTotalPersons = new JLabel("Total Persons");
        text_labelTotalPersons.setBounds(30,130,150,25);
        add(text_labelTotalPersons);

        ///
        JLabel text_totalPersons = new JLabel();
        text_totalPersons.setBounds(220,130,150,25);
        add(text_totalPersons);

        ///
        JLabel text_labelTotalDays = new JLabel("Total Days");
        text_labelTotalDays.setBounds(30,170,150,25);
        add(text_labelTotalDays);

        ///
        JLabel text_totalDays = new JLabel();
        text_totalDays.setBounds(220,170,150,25);
        add(text_totalDays);

        ///
        JLabel text_labelAC = new JLabel("AC/Non-AC");
        text_labelAC.setBounds(30,210,150,25);
        add(text_labelAC);

        ///
        JLabel text_ac = new JLabel();
        text_ac.setBounds(220,210,150,25);
        add(text_ac);

        ///
        JLabel text_labelFoodIncluded = new JLabel("Food Included?");
        text_labelFoodIncluded.setBounds(30,250,150,25);
        add(text_labelFoodIncluded);

        ///
        JLabel text_foodIncluded = new JLabel();
        text_foodIncluded.setBounds(220,250,150,25);
        add(text_foodIncluded);

        ///
        JLabel text_labelID = new JLabel("ID");
        text_labelID.setBounds(30,290,150,25);
        add(text_labelID);

        ///
        JLabel text_ID = new JLabel();
        text_ID.setBounds(220,290,150,25);
        add(text_ID);

        ///
        JLabel text_labelNumber = new JLabel("Number");
        text_labelNumber.setBounds(30,330,150,25);
        add(text_labelNumber);

        ///
        JLabel text_number = new JLabel();
        text_number.setBounds(220,330,150,25);
        add(text_number);


        ///
        JLabel text_labelPhoneNo = new JLabel("Phone Number");
        text_labelPhoneNo.setBounds(30,370,150,25);
        add(text_labelPhoneNo);

        ///
        JLabel text_phoneNo = new JLabel();
        text_phoneNo.setBounds(220,370,150,25);
        add(text_phoneNo);


        ///
        JLabel text_labelPrice= new JLabel("Total Cost");
        text_labelPrice.setBounds(30,410,150,25);
        add(text_labelPrice);

        ///
        JLabel text_price = new JLabel();
        text_price.setBounds(220,410,150,25);
        add(text_price);


        ///
        button_back = new JButton("Back");
        button_back.setBackground(Color.BLACK);
        button_back.setForeground(Color.WHITE);
        button_back.setBounds(130,460,100,25);
        button_back.addActionListener(this);
        add(button_back);


        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        //
        JLabel image = new JLabel(i3);
        image.setBounds(450,20,500,400);
        add(image);


        ///
        try {

            Conn conn = new Conn();
            String query = "select * from book_hotel where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);

            ///
            while (rs.next())
            {
                text_username.setText(rs.getString("username"));
                text_ID.setText(rs.getString("id"));
                text_number.setText(rs.getString("number"));
                text_hotelName.setText(rs.getString("name"));
                text_price.setText(rs.getString("price"));
                text_phoneNo.setText(rs.getString("phone"));
                text_totalPersons.setText(rs.getString("persons"));
                text_foodIncluded.setText(rs.getString("food"));
                text_ac.setText(rs.getString("ac"));
                text_totalDays.setText(rs.getString("days"));
            }

        }
        catch (Exception e)
        {

        }

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
        if (ae.getSource() == button_back)
        {
            //
            setVisible(false);
        }
    }


    public static void main(String[] args) {

        //
        new ViewBookedHotel("");
    }
}
