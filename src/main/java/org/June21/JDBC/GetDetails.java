package org.June21.JDBC;

import javax.swing.*;
import java.sql.*;

public class GetDetails {
    public static void main(String[] args) throws SQLException {
        String dburl="jdbc:mysql://localhost:3306/june22";
        String user="root";
        String pswd="Santh@990118";
        Connection con = DriverManager.getConnection(dburl,user,pswd);
        Statement statement = con.createStatement();
        ResultSet set = statement.executeQuery("select * from employee");
        while (set.next()) {
            System.out.println(set.getInt("emp_id"));
            System.out.println(set.getString("ename"));
        }
    }
}
