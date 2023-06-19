package org.June16.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateData {
    public static void main(String[] args) throws SQLException {
        String DBUrl = "jdbc:mysql://localhost:3306/june14";
        String user = "root";
        String pass = "Santh@990118";
        Connection con = DriverManager.getConnection(DBUrl,user,pass);
        Statement statement = con.createStatement();
        statement.executeUpdate("create table employee(emp_id int primary key,ename varchar(20),salary int);");
        System.out.println("sql executed");
    }
}
