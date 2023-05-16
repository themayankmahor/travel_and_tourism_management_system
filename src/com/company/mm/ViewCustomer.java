package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewCustomer extends JFrame implements ActionListener {

    //
    JButton button_back;

    //
    ViewCustomer(String username)
    {
        //
        int frameWidth = 870;
        int frameHeight = 625;

        //
        setLayout(null);

        //
        getContentPane().setBackground(Color.WHITE);


        ///
        JLabel text_labelUsername = new JLabel("Username");
        text_labelUsername.setBounds(30,50,150,25);
        add(text_labelUsername);

        ///
        JLabel text_username = new JLabel();
        text_username.setBounds(220,50,150,25);
        add(text_username);


        ///
        JLabel text_labelID = new JLabel("ID");
        text_labelID.setBounds(30,110,150,25);
        add(text_labelID);

        ///
        JLabel text_ID = new JLabel();
        text_ID.setBounds(220,110,150,25);
        add(text_ID);


        ///
        JLabel text_labelNumber= new JLabel("Number");
        text_labelNumber.setBounds(30,170,150,25);
        add(text_labelNumber);

        ///
        JLabel text_number = new JLabel();
        text_number.setBounds(220,170,150,25);
        add(text_number);

        ///
        JLabel text_labelName= new JLabel("Name");
        text_labelName.setBounds(30,230,150,25);
        add(text_labelName);

        ///
        JLabel text_name = new JLabel();
        text_name.setBounds(220,230,150,25);
        add(text_name);

        ///
        JLabel text_labelGender= new JLabel("Gender");
        text_labelGender.setBounds(30,290,150,25);
        add(text_labelGender);

        ///
        JLabel text_gender = new JLabel();
        text_gender.setBounds(220,290,150,25);
        add(text_gender);


        ///
        JLabel text_labelCountry = new JLabel("Country");
        text_labelCountry.setBounds(500,50,150,25);
        add(text_labelCountry);

        ///
        JLabel text_country = new JLabel();
        text_country.setBounds(690,50,150,25);
        add(text_country);


        ///
        JLabel text_labelAddress = new JLabel("Address");
        text_labelAddress.setBounds(500,110,150,25);
        add(text_labelAddress);

        ///
        JLabel text_address = new JLabel();
        text_address.setBounds(690,110,150,25);
        add(text_address);


        ///
        JLabel text_labelPhone = new JLabel("Phone Number");
        text_labelPhone.setBounds(500,170,150,25);
        add(text_labelPhone);

        ///
        JLabel text_phone = new JLabel();
        text_phone.setBounds(690,170,150,25);
        add(text_phone);

        ///
        JLabel text_labelEmail = new JLabel("Email");
        text_labelEmail.setBounds(500,230,150,25);
        add(text_labelEmail);

        ///
        JLabel text_email = new JLabel();
        text_email.setBounds(690,230,150,25);
        add(text_email);

        ///
        button_back = new JButton("Back");
        button_back.setBackground(Color.BLACK);
        button_back.setForeground(Color.WHITE);
        button_back.setBounds(350,350,100,25);
        button_back.addActionListener(this);
        add(button_back);

        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        //
        JLabel image = new JLabel(i3);
        image.setBounds(20,400,600,200);
        add(image);

        ///
        ImageIcon i4 = new ImageIcon(i2);
        //
        JLabel image2 = new JLabel(i4);
        image2.setBounds(600,400,600,200);
        add(image2);


        ///
        try {

            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);

            ///
            while (rs.next())
            {
                text_username.setText(rs.getString("username"));
                text_name.setText(rs.getString("name"));
                text_ID.setText(rs.getString("id"));
                text_number.setText(rs.getString("number"));
                text_gender.setText(rs.getString("gender"));
                text_country.setText(rs.getString("country"));
                text_address.setText(rs.getString("address"));
                text_phone.setText(rs.getString("phone"));
                text_email.setText(rs.getString("email"));
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


    //
    public static void main(String[] args) {
        new ViewCustomer("");
    }
}
