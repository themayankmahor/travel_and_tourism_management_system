package com.company.mm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Paytm extends JFrame implements ActionListener {

    //
    JButton button_back;

    //
    Paytm()
    {
        //
        int frameWidth = 800;
        int frameHeight = 600;

        ///
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);

        try
        {
            pane.setPage("https://paytm.com/rent-payment");
        }
        catch (Exception e)
        {
            pane.setContentType("text/html");
            pane.setText("<html>Could not load, Error 404</html>");
        }

        //
        JScrollPane scrollPane = new JScrollPane(pane);
        getContentPane().add(scrollPane);

        ///
        button_back = new JButton("Back");
        button_back.setBounds(610,20,80,40);
        button_back.addActionListener(this);
        pane.add(button_back);

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
            //
            new Payment();
        }
    }

    ///
    public static void main(String[] args) {
        //
        new Paytm();
    }
}
