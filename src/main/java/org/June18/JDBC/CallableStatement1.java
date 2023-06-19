package org.June18.JDBC;

import java.sql.*;

public class CallableStatement1 {
    public static void main(String[] args) throws SQLException {
        String dburl = "jdbc:mysql://localhost:3306/june18";
        String user = "root";
        String pswd = "Santh@990118";
        Connection connection = DriverManager.getConnection(dburl, user, pswd);
        PreparedStatement callableStatement = connection.prepareStatement("insert into employee values(?,?,?);");
        callableStatement.setString(1, "Santhosh");
        callableStatement.setInt(2, 19950);
        callableStatement.setString(3, "Chennai");
        callableStatement.executeUpdate();
        System.out.println("inserted");
    }

}
