package com.info.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {
    public static void main(String[] args) throws Exception {

    	Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db",
                "root",
                "your-password"
            );
        String sql = "INSERT INTO student(stud_name, stud_city, stud_marks, stud_phone) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "Amit");
        ps.setString(2, "Pune");
        ps.setInt(3, 85);
        ps.setString(4, "9876543210");

        ps.executeUpdate();
        System.out.println("Record Inserted");

        con.close();
    }
}

