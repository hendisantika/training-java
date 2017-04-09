package com.hendisantika.jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by hendisantika on 4/8/17.
 */
public class JDBCStatementDeleteExample {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost/trainingDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //    private static final String DB_CONNECTION = "jdbc:mysql://localhost/trainingDB";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] argv) {

        try {

            deleteRecordFromDbUserTable();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }

    private static void deleteRecordFromDbUserTable() throws SQLException {

        Connection dbConnection = null;
        Statement statement = null;

        String deleteTableSQL = "DELETE FROM DBUSER WHERE USER_ID = 3";

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();

            System.out.println(deleteTableSQL);

            // execute delete SQL stetement
            statement.execute(deleteTableSQL);

            System.out.println("Record is deleted from DBUSER table!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (statement != null) {
                statement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }

    private static Connection getDBConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            dbConnection = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER,DB_PASSWORD);
            return dbConnection;

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return dbConnection;

    }
}
