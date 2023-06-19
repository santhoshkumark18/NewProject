package org.June16.JDBC;

import java.sql.*;

public class InsertQuery {
    public static void main(String[] args) throws SQLException {
        String DBurl = "jdbc:mysql://localhost:3306/june14";
        String user ="root";
        String pass = "Santh@990118";
        Connection con = DriverManager.getConnection(DBurl,user,pass);
        Statement statement = con.createStatement();
        /*statement.executeUpdate("insert into values(?,?,?)");*/
       ResultSet resultSet = statement.executeQuery("select * from employee");
        System.out.println("executed");
    }
}
