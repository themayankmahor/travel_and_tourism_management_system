package com.company.mm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {

    //
    JButton button_create, button_back;

    //
    JTextField textField_username, textField_name, textField_answer;

    //
    JPasswordField textField_password;

    //
    Choice security;

    //
    SignUp()
    {
        int frameWidth = 900;
        int frameHeight = 360;

        //
        getContentPane().setBackground(Color.WHITE);
        //
        setLayout(null);


        ///
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(133, 193, 233));
        panel1.setBounds(0,0,frameWidth - 400, frameHeight - 40);
        panel1.setLayout(null);
        add(panel1);

        ///
        JLabel text_username = new JLabel("Username");
        text_username.setFont(new Font("Tahoma", Font.BOLD, 14));
        text_username.setBounds(50, 20, 125, 25);
        panel1.add(text_username);

        ///
        textField_username = new JTextField();
        textField_username.setBounds(190, 20, 180,25);
        textField_username.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_username);

        ///
        JLabel text_name = new JLabel("Name");
        text_name.setFont(new Font("Tahoma", Font.BOLD, 14));
        text_name.setBounds(50, 60, 125, 25);
        panel1.add(text_name);

        ///
        textField_name = new JTextField();
        textField_name.setBounds(190, 60, 180,25);
        textField_name.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_name);

        ///
        JLabel text_password = new JLabel("Password");
        text_password.setFont(new Font("Tahoma", Font.BOLD, 14));
        text_password.setBounds(50, 100, 125, 25);
        panel1.add(text_password);

        ///
        textField_password = new JPasswordField();
        textField_password.setBounds(190, 100, 180,25);
        textField_password.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_password);

        ///
        JLabel text_security = new JLabel("Security Question");
        text_security.setFont(new Font("Tahoma", Font.BOLD, 14));
        text_security.setBounds(50, 140, 125, 25);
        panel1.add(text_security);

        ///
        security = new Choice();
        security.add("Fav Character from The Boys");
        security.add("Fav Marvel superhero");
        security.add("Your Lucky number");
        security.add("Your childhood superhero");
        security.setBounds(190,140,180,25);
        panel1.add(security);


        ///
        JLabel text_answer = new JLabel("Answer");
        text_answer.setFont(new Font("Tahoma", Font.BOLD, 14));
        text_answer.setBounds(50,180, 125, 25);
        panel1.add(text_answer);

        ///
        textField_answer = new JTextField();
        textField_answer.setBounds(190, 180, 180,25);
        textField_answer.setBorder(BorderFactory.createEmptyBorder());
        panel1.add(textField_answer);

        ///
        button_create = new JButton("Create");
        button_create.setBackground(Color.WHITE);
        button_create.setForeground(new Color(133,193,233));
        button_create.setFont(new Font("Tahoma", Font.BOLD, 14));
        button_create.setBounds(80, 250, 100, 30);
        button_create.addActionListener(this);
        panel1.add(button_create);

        ///
        button_back = new JButton("Back");
        button_back.setBackground(Color.WHITE);
        button_back.setForeground(new Color(133,193,233));
        button_back.setFont(new Font("Tahoma", Font.BOLD, 14));
        button_back.setBounds(250, 250, 100, 30);
        button_back.addActionListener(this);
        panel1.add(button_back);

        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(580, 50, 250, 250);
        add(image);


        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);
        //
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        //
        if (ae.getSource() == button_create)
        {
            //
            String username = textField_username.getText();
            String name = textField_name.getText();
            String password = textField_password.getText();
            String question = security.getSelectedItem();
            String answer = textField_answer.getText();

            //
            if (username.isEmpty() || name.isEmpty() || password.isEmpty() || question.isEmpty() || answer.isEmpty()) {

                //
                JOptionPane.showMessageDialog(null, "Required field is empty");

            }
            else
            {
                try {
                    String query = "insert into account values('" + username + "', '" + name + "', '" + password + "', '" + question + "', '" + answer + "')";

                    //
                    Conn conn = new Conn();
                    conn.s.executeUpdate(query);

                    //
                    JOptionPane.showMessageDialog(null, "Account Create Successfully");
                    //
                    setVisible(false);
                    //
                    new Login();

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
        else
        {
            //
            setVisible(false);
            new Login();
        }
    };

    public static void main(String[] args) {
        new SignUp();
    }

}
