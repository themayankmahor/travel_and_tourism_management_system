package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener {

    //
    JLabel text_labelUserName, text_labelName;

    //
    JTextField textField_number, textField_country, textField_address, textField_email, textField_phoneNo, textField_ID, textField_gender;

    //
    JButton button_update, button_back;

    //
    UpdateCustomer(String username)
    {
        //
        int frameWidth = 850;
        int frameHeight = 550;

        //
        setLayout(null);

        //
        getContentPane().setBackground(Color.WHITE);


        ///
        JLabel text_title = new JLabel("UPDATE CUSTOMER DETAILS");
        text_title.setBounds(50,0,300,25);
        text_title.setFont(new Font("Rahoma", Font.PLAIN, 20));
        add(text_title);


        ///
        JLabel text_username = new JLabel("Username");
        text_username.setBounds(30,50,150,25);
        add(text_username);

        ///
        text_labelUserName = new JLabel("Username");
        text_labelUserName.setBounds(220,50,150,25);
        add(text_labelUserName);

        ///
        JLabel text_ID = new JLabel("ID");
        text_ID.setBounds(30,90,150,25);
        add(text_ID);

        ///
        textField_ID = new JTextField();
        textField_ID.setBounds(220,90,150,25);
        add(textField_ID);

        ///
        JLabel text_number = new JLabel("Number");
        text_number.setBounds(30,130,150,25);
        add(text_number);

        ///
        textField_number = new JTextField();
        textField_number.setBounds(220,130,150,25);
        add(textField_number);


        ///
        JLabel text_name = new JLabel("Name");
        text_name.setBounds(30,170,150,25);
        add(text_name);


        ///
        text_labelName = new JLabel();
        text_labelName.setBounds(220,170,150,25);
        add(text_labelName);

        ///
        JLabel text_gender = new JLabel("Gender");
        text_gender.setBounds(30,210,150,25);
        add(text_gender);

        ///
        textField_gender = new JTextField();
        textField_gender.setBounds(220,210,150,25);
        add(textField_gender);

        ///
        JLabel text_country = new JLabel("Country");
        text_country.setBounds(30,250,150,25);
        add(text_country);

        ///
        textField_country = new JTextField();
        textField_country.setBounds(220,250,150,25);
        add(textField_country);

        ///
        JLabel text_address = new JLabel("Address");
        text_address.setBounds(30,290,150,25);
        add(text_address);

        ///
        textField_address = new JTextField();
        textField_address.setBounds(220,290,150,25);
        add(textField_address);

        ///
        JLabel text_phoneNo = new JLabel("Phone Number");
        text_phoneNo.setBounds(30,330,150,25);
        add(text_phoneNo);

        ///
        textField_phoneNo = new JTextField();
        textField_phoneNo.setBounds(220,330,150,25);
        add(textField_phoneNo);


        ///
        JLabel text_email = new JLabel("Email");
        text_email.setBounds(30,370,150,25);
        add(text_email);

        ///
        textField_email = new JTextField();
        textField_email.setBounds(220,370,150,25);
        add(textField_email);

        ///
        button_update = new JButton("Update");
        button_update.setBackground(Color.BLACK);
        button_update.setForeground(Color.WHITE);
        button_update.setBounds(70,430,100,25);
        button_update.addActionListener(this);
        add(button_update);

        ///
        button_back = new JButton("Back");
        button_back.setBackground(Color.BLACK);
        button_back.setForeground(Color.WHITE);
        button_back.setBounds(220,430,100,25);
        button_back.addActionListener(this);
        add(button_back);

        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image i2 = i1.getImage().getScaledInstance(200,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        //
        JLabel image = new JLabel(i3);
        image.setBounds(500,40,200,400);
        add(image);

        ///
        try {

            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from customer where username = '"+username+"'");
            //
            while (rs.next())
            {
                text_labelUserName.setText(rs.getString("username"));
                text_labelName.setText(rs.getString("name"));
                textField_ID.setText(rs.getString("id"));
                textField_number.setText(rs.getString("number"));
                textField_gender.setText(rs.getString("gender"));
                textField_country.setText(rs.getString("country"));
                textField_address.setText(rs.getString("address"));
                textField_phoneNo.setText(rs.getString("phone"));
                textField_email.setText(rs.getString("email"));
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);
        //
        setVisible(true);
    }

    //
    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_update)
        {
            //
            String username = text_labelUserName.getText();
            String id = textField_ID.getText();
            String number = textField_number.getText();
            String name = text_labelName.getText();
            String gender = textField_gender.getText();
            String country = textField_country.getText();
            String address = textField_address.getText();
            String phoneNo = textField_phoneNo.getText();
            String email = textField_email.getText();


                ///
                try {

                    ///
                    Conn conn = new Conn();
                    String query = "update customer set username = '"+username+"', id = '"+id+"', number = '"+number+"', name = '"+name+"', gender = '"+gender+"', country = '"+country+"', address = '"+address+"', phone = '"+phoneNo+"', email = '"+email+"'";
                    conn.s.executeUpdate(query);

                    //
                    JOptionPane.showMessageDialog(null, "Customer Details Updated Successfully");
                    //
                    setVisible(false);
                } catch (Exception e) {
                    System.out.println(e);

                }
        }
        else
        {
            //
            setVisible(false);
        }
    }

    //
    public static void main(String[] args) {

        //
        new UpdateCustomer("");
    }
}
