package com.info.jdbcconnection;

import java.sql.*;

public class UpdateStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db",
                "root",
                "your-password"
            );

            String sql = "UPDATE student SET stud_marks=? WHERE stud_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 95);
            ps.setInt(2, 1);

            ps.executeUpdate();
            System.out.println("Record Updated");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
