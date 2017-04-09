package com.hendisantika.jdbc;

import org.flywaydb.core.Flyway;

import java.sql.SQLException;

/**
 * Created by hendisantika on 4/8/17.
 */
public class RunSqlScript {
    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException,
            SQLException {

        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost",
                "root", "root");
        flyway.setLocations("classpath:db/schema.sql");
        flyway.clean();
        flyway.migrate();
    }
}
