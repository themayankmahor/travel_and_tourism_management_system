package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {

    //
    JTextField textField_username, textField_name, textField_question, textField_answer, textField_password;

    //
    JButton button_search, button_retrieve, button_back;

    //
    ForgetPassword()
    {
        //
        int frameWidth = 850;
        int frameHeight = 380;

        //
        setLayout(null);

        //
        getContentPane().setBackground(Color.WHITE);

        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(580, 70, 200, 200);
        add(image);

        ///
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(40,20,500, 280);
        add(panel1);

        ///
        JLabel text_username = new JLabel("Username");
        text_username.setBounds(40, 20, 100, 25);
        text_username.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel1.add(text_username);

        ///
        textField_username = new JTextField();
        textField_username.setBounds(220, 20, 150, 25);
        textField_username.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_username);

        ///
        button_search = new JButton("Search");
        button_search.setBackground(Color.GRAY);
        button_search.setForeground(Color.WHITE);
        button_search.addActionListener(this);
        button_search.setBounds(380, 20, 100,25);
        panel1.add(button_search);


        ///

        ///
        JLabel text_name = new JLabel("Name");
        text_name.setBounds(40, 60, 100, 25);
        text_name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel1.add(text_name);

        ///
        textField_name = new JTextField();
        textField_name.setBounds(220, 60, 150, 25);
        textField_name.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_name);

        ///
        JLabel text_question = new JLabel("Your security question");
        text_question.setBounds(40, 100, 170, 25);
        text_question.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel1.add(text_question);

        ///
        textField_question = new JTextField();
        textField_question.setBounds(220, 100, 150, 25);
        textField_question.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_question);

        ///
        JLabel text_answer = new JLabel("Answer");
        text_answer.setBounds(40, 140, 100, 25);
        text_answer.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel1.add(text_answer);

        ///
        textField_answer = new JTextField();
        textField_answer.setBounds(220, 140, 150, 25);
        textField_answer.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_answer);

        ///
        button_retrieve = new JButton("Retrieve");
        button_retrieve.setBackground(Color.GRAY);
        button_retrieve.setForeground(Color.WHITE);
        button_retrieve.setBounds(380, 140, 100,25);
        button_retrieve.addActionListener(this);
        panel1.add(button_retrieve);

        ///
        JLabel text_password = new JLabel("Password");
        text_password.setBounds(40, 180, 100, 25);
        text_password.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel1.add(text_password);

        ///
        textField_password = new JTextField();
        textField_password.setBounds(220, 180, 150, 25);
        textField_password.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_password);

        ///
        button_back = new JButton("Back");
        button_back.setBackground(Color.GRAY);
        button_back.setForeground(Color.WHITE);
        button_back.setBounds(190, 230, 100,25);
        button_back.addActionListener(this);
        panel1.add(button_back);

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
        if (ae.getSource() == button_search)
        {
            String username = textField_username.getText();

            try
            {
                String query = "select * from account where username = '"+username+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);

                //
                while (rs.next())
                {
                    //
                    textField_name.setText(rs.getString("name"));
                    textField_question.setText(rs.getString("security"));
                }
            }
            catch (Exception e)
            {
                //
                System.out.println(e);
            }

        }
        else if (ae.getSource() == button_retrieve)
        {
            String username = textField_username.getText();
            String answer = textField_answer.getText();
            //
            try
            {
                String query = "select * from account where answer = '"+answer+"' AND username = '"+username+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);

                System.out.println(rs);

                //
                while (rs.next())
                {
                    //
                    textField_password.setText(rs.getString("password"));
                }

            }
            catch (Exception e)
            {
                //
                System.out.println(e);
            }
        }
        else
        {
            //
            setVisible(false);
            //
            new Login();
        }

    }

    public static void main(String[] args) {

        new ForgetPassword();
    }
}
