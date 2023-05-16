package com.company.mm;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    //
    JButton button_login, button_signUp, button_forgotPassword;

    //
    JTextField textField_username;

    //
    JPasswordField passwordField_loginPassword;

    //
    Login()
    {
        //
        int frameWidth = 900;
        int frameHeight = 400;

        //
        setLayout(null);

        //
        getContentPane().setBackground(Color.WHITE);

        //
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(131, 193, 233));
        panel1.setBounds(0, 0,frameWidth - 500, frameHeight);
        panel1.setLayout(null);
        add(panel1);

        //
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image_login = new JLabel(i3);
        image_login.setBounds(100, 120, 200, 200);
        panel1.add(image_login);

        ///
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(400, 30, 450, 300);
        add(panel2);

        ///
        JLabel text_username = new JLabel("Username");
        text_username.setBounds(60,20,100,25);
        text_username.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        panel2.add(text_username);

        ///
        textField_username = new JTextField();
        textField_username.setBounds(60,60, 300, 30);
        textField_username.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(textField_username);

        ///
        JLabel text_password = new JLabel("Password");
        text_password.setBounds(60,110,100,25);
        text_password.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
        panel2.add(text_password);

        //
        passwordField_loginPassword = new JPasswordField();
        passwordField_loginPassword.setBounds(60,150,300,30);
        passwordField_loginPassword.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(passwordField_loginPassword);

        ///
        button_login = new JButton("LOGIN");
        button_login.setBounds(60,200,130,30);
        button_login.setBackground(new Color(133, 193, 233));
        button_login.setForeground(Color.WHITE);
        button_login.setBorder(new LineBorder(new Color(133,193,233)));
        button_login.addActionListener(this);
        panel2.add(button_login);

        ///
        button_signUp = new JButton("SIGN UP");
        button_signUp.setBounds(230,200,130,30);
        button_signUp.setBackground(new Color(133, 193, 233));
        button_signUp.setForeground(Color.WHITE);
        button_signUp.setBorder(new LineBorder(new Color(133,193,233)));
        button_signUp.addActionListener(this);
        panel2.add(button_signUp);

        ///
        button_forgotPassword = new JButton("FORGOT PASSWORD");
        button_forgotPassword.setBounds(130,250,130,30);
        button_forgotPassword.setBackground(new Color(133, 193, 233));
        button_forgotPassword.setForeground(Color.WHITE);
        button_forgotPassword.setBorder(new LineBorder(new Color(133,193,233)));
        button_forgotPassword.addActionListener(this);
        panel2.add(button_forgotPassword);

        ///
        JLabel text_forgotPassword = new JLabel("Trouble in login...");
        text_forgotPassword.setBounds(300,250,150,20);
        text_forgotPassword.setForeground(Color.RED);
        panel2.add(text_forgotPassword);


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
        if (ae.getSource() == button_login)
        {
            //
            String username = textField_username.getText();
            String password = passwordField_loginPassword.getText();

            try
            {
                //
                if (username.isEmpty() || password.isEmpty()) {

                    //
                    JOptionPane.showMessageDialog(null, "Required filed is empty");

                }
                else
                {
                    //
                    String query = "select * from account where username = '" + username + "' AND password = '" + password + "'";

                    //
                    Conn conn = new Conn();
                    ResultSet rs = conn.s.executeQuery(query);

                    //
                    if (rs.next())
                    {
                        //
                        setVisible(false);
                        //
                        new Loading(username);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Incorrect username or password");
                    }
                }

            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        else if (ae.getSource() == button_signUp)
        {
            //
            setVisible(false);
            //
            new SignUp();
        }
        else
        {
            //
            setVisible(false);
            //
            new ForgetPassword();
        }
    };


    //
    public static void main(String[] args) {

        //Anonymous object
        new Login();

    }
}
