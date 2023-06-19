package org.June16.JDBC;

import java.sql.*;

public class prepareStatement {
    public static void main(String[] args) throws SQLException {
        String DBurl = "jdbc:mysql://localhost:3306/june14";
        String user ="root";
        String pass = "Santh@990118";
        Connection con = DriverManager.getConnection(DBurl,user,pass);
        PreparedStatement statement = con.prepareStatement("insert into employee values(?,?,?);");
        statement.setInt(1,1);
        statement.setString(2,"Santhosh");
        statement.setInt(3,27000);
        statement.executeUpdate();
        System.out.println("executed");
    }
}
