package com.info.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static void main(String[] args) {

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db",
                "root",
                "your-password"   // your mysql password
            );

            System.out.println("Connection Successful!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

