package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {

    //
    Choice choice_package;

    //
    JTextField textField_persons;
    //
    String username;
    //
    JLabel text_username, text_ID, text_number, text_phone, text_price;
    //
    JButton button_checkPrice, button_bookPackage, button_back;

    //
    BookPackage(String username)
    {
        //
        this.username = username;
        //
        int frameWidth = 1100;
        int frameHeight = 500;

        //
        setLayout(null);
        //
        getContentPane().setBackground(Color.WHITE);

        ///
        JLabel text_bookPackage = new JLabel("BOOK PACKAGE");
        text_bookPackage.setBounds(100,10,200,30);
        text_bookPackage.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(text_bookPackage);

        ///
        JLabel text_labelUsername = new JLabel("Username");
        text_labelUsername.setBounds(40,70,100,20);
        text_labelUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text_labelUsername);

        ///
        text_username = new JLabel();
        text_username.setBounds(250,70,100,20);
        text_username.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text_username);


        ///
        JLabel text_labelSelectPackage = new JLabel("Select Package");
        text_labelSelectPackage.setBounds(40,110,200,20);
        text_labelSelectPackage.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text_labelSelectPackage);

        ///
        choice_package = new Choice();
        choice_package.add("Gold Package");
        choice_package.add("Silver Package");
        choice_package.add("Bronze Package");
        choice_package.setBounds(250,110,150,20);
        add(choice_package);


        ///
        JLabel text_labelTotalPerson = new JLabel("Total Persons");
        text_labelTotalPerson.setBounds(40,150,150,25);
        text_labelTotalPerson.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text_labelTotalPerson);

        textField_persons = new JTextField("1");
        textField_persons.setBounds(250,150,200,25);
        add(textField_persons);

        ///
        JLabel text_labelID = new JLabel("ID");
        text_labelID.setBounds(40,190,150,20);
        text_labelID.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text_labelID);

        ///
        text_ID = new JLabel();
        text_ID.setBounds(250,190,200,25);
        add(text_ID);

        ///
//        JLabel text_name = new JLabel();
//        text_name.setBounds(220,230,150,25);
//        add(text_name);

        ///
        JLabel text_labelNumber = new JLabel("Number");
        text_labelNumber.setBounds(40,230,150,25);
        text_labelNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text_labelNumber);

        ///
        text_number = new JLabel();
        text_number.setBounds(250,230,150,25);
        add(text_number);

        ///
        JLabel text_labelPhoneNo= new JLabel("Phone");
        text_labelPhoneNo.setBounds(40,270,150,25);
        text_labelPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text_labelPhoneNo);

        ///
        text_phone = new JLabel();
        text_phone.setBounds(250,270,200,25);
        add(text_phone);

        ///
        JLabel text_labelTotalPrice = new JLabel("Total Price");
        text_labelTotalPrice.setBounds(40,310,150,25);
        text_labelTotalPrice.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(text_labelTotalPrice);

        ///
        text_price = new JLabel();
        text_price.setBounds(250,310,150,25);
        add(text_price);

        ///
        try {

            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);

            ///
            while (rs.next())
            {
                text_username.setText(rs.getString("username"));
                //text_name.setText(rs.getString("name"));
                text_ID.setText(rs.getString("id"));
                text_number.setText(rs.getString("number"));
                //text_gender.setText(rs.getString("gender"));
                //text_country.setText(rs.getString("country"));
                //text_address.setText(rs.getString("address"));
                text_phone.setText(rs.getString("phone"));
                //text_email.setText(rs.getString("email"));
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        ///
        button_checkPrice = new JButton("Check Price");
        button_checkPrice.setBackground(Color.BLACK);
        button_checkPrice.setForeground(Color.WHITE);
        button_checkPrice.setBounds(60,380,120,25);
        button_checkPrice.addActionListener(this);
        add(button_checkPrice);

        ///
        button_bookPackage = new JButton("Book Package");
        button_bookPackage.setBackground(Color.BLACK);
        button_bookPackage.setForeground(Color.WHITE);
        button_bookPackage.setBounds(340,380,120,25);
        button_bookPackage.addActionListener(this);
        add(button_bookPackage);

        ///
        button_back = new JButton("Back");
        button_back.setBackground(Color.BLACK);
        button_back.setForeground(Color.WHITE);
        button_back.setBounds(200,380,120,25);
        button_back.addActionListener(this);
        add(button_back);



        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        //
        JLabel image_label9 = new JLabel(i3);
        image_label9.setBounds(550,50,500,300);
        add(image_label9);


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
        if (ae.getSource() == button_checkPrice)
        {
            //
            String packageName = choice_package.getSelectedItem();
            //
            int cost = 0;

            //
            if (packageName.equals("Gold Package"))
            {
                cost += 12000;

            }else if (packageName.equals("Silver Package"))
            {
                cost += 25000;

            }else
            {

                cost += 32000;
            }

            int persons = Integer.parseInt(textField_persons.getText());
            cost *= persons;

            //
            text_price.setText("Rs. "+cost);

        }else if (ae.getSource() == button_bookPackage)
        {
            try
            {
                //
                Conn conn = new Conn();
                conn.s.executeUpdate("insert into  book_package values('"+text_username.getText()+"', '"+choice_package.getSelectedItem()+"', '"+textField_persons.getText()+"', '"+text_ID.getText()+"', '"+text_number.getText()+"', '"+text_phone.getText()+"', '"+text_price.getText()+"')");

                //
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                setVisible(false);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            //
            setVisible(false);
        }

    }

    ///
    public static void main(String[] args) {

        //
        new BookPackage("");
    }
}
