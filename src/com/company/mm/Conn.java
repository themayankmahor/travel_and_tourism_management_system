package com.company.mm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;
    //Constructor (JAVA DATABASE CONNECTIVITY)
    Conn()
    {
        try{
            c = DriverManager.getConnection("jdbc:mysql:///travel_management_system", "root", "12345678");
            s = c.createStatement();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
