package com.hendisantika.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by hendisantika on 4/8/17.
 */
public class JdbcMySQL {
    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
//            Class.forName("com.mysql.jdbc.Driver"); // MySQL <= 5
            Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL > 5
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;

        try {
            connection = DriverManager
//                    .getConnection("jdbc:mysql://localhost:3306/tesDB","root", "root"); // MySQL <= 5
                    .getConnection("jdbc:mysql://localhost/trainingDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\n","root", "root"); // > 5

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }
}
