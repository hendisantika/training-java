package com.hendisantika.jdbc.mysql;

import java.sql.*;

import static com.hendisantika.jdbc.mysql.JDBCStatementInsertExample.dateFormat;


/**
 * Created by hendisantika on 4/8/17.
 */
public class JDBCBatchUpdateExample {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost/trainingDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] argv) {

        try {

            batchInsertRecordsIntoTable();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }

    private static void batchInsertRecordsIntoTable() throws SQLException {

        Connection dbConnection = null;
        Statement statement = null;

        String insertTableSQL1 = "INSERT INTO DBUSER"
                + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) " + "VALUES"
                + "(101,'sasuke','system', " + "'" + getCurrentTimeStamp() + "')";

        String insertTableSQL2 = "INSERT INTO DBUSER"
                + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) " + "VALUES"
                + "(102,'sakura','system', " + "'" + getCurrentTimeStamp() + "')";

        String insertTableSQL3 = "INSERT INTO DBUSER"
                + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) " + "VALUES"
                + "(103,'kakashi','system', "+ "'" + getCurrentTimeStamp() + "')";

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();

            dbConnection.setAutoCommit(false);

            statement.addBatch(insertTableSQL1);
            statement.addBatch(insertTableSQL2);
            statement.addBatch(insertTableSQL3);

            statement.executeBatch();

            dbConnection.commit();

            System.out.println("Records are inserted into DBUSER table!");

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

    private static String getCurrentTimeStamp() {
//    private static Date getCurrentTimeStamp() {

        java.util.Date today = new java.util.Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        return sdf.format(today.getTime());
        return dateFormat.format(today.getTime());
//        return new java.sql.Date(today.getTime());
    }
}
