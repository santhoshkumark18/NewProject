package org.June21.JDBC;

import javax.swing.*;
import java.sql.*;

public class InsertDetails {
    public static void main(String[] args) throws SQLException {
        String dburl="jdbc:mysql://localhost:3306/june22";
        String user="root";
        String pass="Santh@990118";
        Connection connection = DriverManager.getConnection(dburl,user,pass);
        PreparedStatement statement = connection.prepareStatement("insert into employee values(?,?);");
        statement.setInt(1,1);
        statement.setString(2,"Santhosh");
        statement.executeUpdate();
        System.out.println("executed");
    }
}
