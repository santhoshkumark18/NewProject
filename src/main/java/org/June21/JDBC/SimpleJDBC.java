package org.June21.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleJDBC {
    public static void main(String[] args) throws SQLException {
        String dburl = "jdbc:mysql://localhost:3306/june22";
        String user="root";
        String pswd="Santh@990118";
        Connection connection = DriverManager.getConnection(dburl,user,pswd);
        Statement statement = connection.createStatement();
        statement.executeUpdate("create table employee(emp_id int primary key,ename varchar(30));");
        System.out.println("Query executed successfully");
    }
}
