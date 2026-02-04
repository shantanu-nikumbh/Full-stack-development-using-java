package com.info.jdbcconnection;

import java.sql.*;

public class DeleteStudent {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_db",
                "root",
                "your-password"
            );

            String sql = "DELETE FROM student WHERE stud_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 3);

            ps.executeUpdate();
            System.out.println("Record Deleted");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
