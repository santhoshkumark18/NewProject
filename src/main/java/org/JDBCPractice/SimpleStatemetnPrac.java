package org.JDBCPractice;

import java.sql.*;

public class SimpleStatemetnPrac {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo1";
        String user = "root";
        String pswd = "Santh@990118";
        Connection con = DriverManager.getConnection(url,user,pswd);
        Statement stat = con.createStatement();
        ResultSet set = stat.getResultSet();
        while (set.next()) {
            set.getInt(0);
            set.getString(1);
            set.getInt(2);
        }
    }
}
