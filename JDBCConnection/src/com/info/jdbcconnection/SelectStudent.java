package com.info.jdbcconnection;

import java.sql.*;

public class SelectStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db",
                "root",
                "your-password"
            );

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("stud_id") + " " +
                    rs.getString("stud_name") + " " +
                    rs.getString("stud_city") + " " +
                    rs.getInt("stud_marks") + " " +
                    rs.getString("stud_phone")
                );
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

