package org.June18.JDBC;

import java.sql.*;

public class Simple {
    public static void main(String[] args) throws SQLException {
        String dbUrl ="jdbc:mysql://localhost:3306/june18";
        String user="root";
        String pswd ="Santh@990118";
        Connection con = DriverManager.getConnection(dbUrl,user,pswd);
        Statement statement = con.createStatement();
       ResultSet set = statement.executeQuery("select * from employee");
        while (set.next()) {
            System.out.println(set.getString("ename"));
            System.out.println(set.getInt("salary"));
            System.out.println(set.getString("location"));
        }
    }
}
