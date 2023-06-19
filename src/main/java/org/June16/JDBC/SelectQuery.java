package org.June16.JDBC;

import com.mysql.cj.exceptions.DataReadException;

import java.sql.*;

public class SelectQuery {
    public static void main(String[] args) throws SQLException {
        String dburl ="jdbc:mysql://localhost:3306/june14";
        String user ="root";
        String pass = "Santh@990118";
        pass.length();
        Connection con = DriverManager.getConnection(dburl,user,pass);
        Statement statement = con.createStatement();
        ResultSet resultSet =statement.executeQuery("select * from employee");
        while(resultSet.next()) {
            System.out.println(resultSet.getString("ename"));
            System.out.println(resultSet.getInt("salary"));
        }
    }
}
