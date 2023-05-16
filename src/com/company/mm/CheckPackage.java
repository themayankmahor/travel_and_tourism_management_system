package com.company.mm;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    //
    CheckPackage()
    {
        //
        int frameWidth = 900;
        int frameHeight = 600;

        //
        String[] package1 = {"Gold Package", "6 Days and 7 Nights", "Airport Assistance", "Half Day City Tour", "Daily Buffet", "Soft Drinks Free", "Full Day 3 Island Cruise", "English Speaking Guide", "Book Package", "Summer Special", "12000/-", "package1.jpg"};
        String[] package2 = {"Silver Package", "5 Days and 6 Nights", "Toll Free", "Entrance Free Tickets", "Meet and Greet ait Airport", "Welcome Drinks on Arrival", "Night Safari", "Cruise with Dinner", "Book Now", "Winter Special", "24000/-", "package2.jpg"};
        String[] package3 = {"Bronze Package", "6 Days and 5 Nights", "Return Airfare", "Free Clubbing Horse Riding & Other Games", "River Rafting", "Hard Drinks Free", "Daily Buffet", "BBQ Dinner", "Book Now", "Winter Special", "32000/-", "package3.jpg"};

        //
        getContentPane().setBackground(Color.WHITE);

        ///
        JTabbedPane tabbedPane = new JTabbedPane();
        //
        JPanel panel1 = createPackage(package1);
        tabbedPane.addTab("Package 1", null, panel1);

        //
        JPanel panel2 = createPackage(package2);
        tabbedPane.addTab("Package 2", null, panel2);

        //
        JPanel panel3 = createPackage(package3);
        tabbedPane.addTab("Package 3", null, panel3);

        add(tabbedPane);

        //
        setSize(frameWidth, frameHeight);
        //
        setLocationRelativeTo(null);
        //
        setVisible(true);
    }

    ///
    public JPanel createPackage(String[] pack)
    {
        ///
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.WHITE);

        ///
        JLabel text_goldPackage = new JLabel(pack[0]);
        text_goldPackage.setBounds(50,5,300,30);
        text_goldPackage.setForeground(Color.YELLOW);
        text_goldPackage.setFont(new Font("Tahoma", Font.BOLD, 30));
        panel1.add(text_goldPackage);

        ///
        JLabel text_goldFeatures = new JLabel(pack[1]);
        text_goldFeatures.setBounds(30,60,300,30);
        text_goldFeatures.setForeground(Color.RED);
        text_goldFeatures.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel1.add(text_goldFeatures);

        ///
        JLabel text_airportAssistance = new JLabel(pack[2]);
        text_airportAssistance.setBounds(30,110,300,30);
        text_airportAssistance.setForeground(Color.BLUE);
        text_airportAssistance.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel1.add(text_airportAssistance);

        ///
        JLabel text_label = new JLabel(pack[3]);
        text_label.setBounds(30,160,300,30);
        text_label.setForeground(Color.RED);
        text_label.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel1.add(text_label);

        ///
        JLabel text_label2 = new JLabel(pack[4]);
        text_label2.setBounds(30,210,300,30);
        text_label2.setForeground(Color.BLUE);
        text_label2.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel1.add(text_label2);

        ///
        JLabel text_label3 = new JLabel(pack[5]);
        text_label3.setBounds(30,260,300,30);
        text_label3.setForeground(Color.RED);
        text_label3.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel1.add(text_label3);

        ///
        JLabel text_label4 = new JLabel(pack[6]);
        text_label4.setBounds(30,310,300,30);
        text_label4.setForeground(Color.BLUE);
        text_label4.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel1.add(text_label4);

        ///
        JLabel text_label5 = new JLabel(pack[7]);
        text_label5.setBounds(30,360,300,30);
        text_label5.setForeground(Color.RED);
        text_label5.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel1.add(text_label5);

        ///
        JLabel text_label6= new JLabel(pack[8]);
        text_label6.setBounds(60,430,300,30);
        text_label6.setForeground(Color.BLACK);
        text_label6.setFont(new Font("Tahoma", Font.BOLD, 25));
        panel1.add(text_label6);

        ///
        JLabel text_label7= new JLabel(pack[9]);
        text_label7.setBounds(60,480,300,30);
        text_label7.setForeground(Color.MAGENTA);
        text_label7.setFont(new Font("Tahoma", Font.BOLD, 25));
        panel1.add(text_label7);

        ///
        JLabel text_label8= new JLabel(pack[10]);
        text_label8.setBounds(500,480,300,30);
        text_label8.setForeground(Color.CYAN);
        text_label8.setFont(new Font("Tahoma", Font.BOLD, 25));
        panel1.add(text_label8);

        ///
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        //
        JLabel image_label9 = new JLabel(i3);
        image_label9.setBounds(350,20,500,300);
        panel1.add(image_label9);

        return panel1;
    }


    ///
    public static void main(String[] args) {
        //
        new CheckPackage();
    }
}
