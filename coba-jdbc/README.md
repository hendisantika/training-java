# JDBC Tutorial


The Java Database Connectivity (JDBC) API enable Java application to interact with a database. In this tutorials, it provides many step by step examples on using JDBC Statement, PreparedStatement , CallableStatement , JDBC Transaction and how to integrate with other frameworks like Spring.

Happy learning JDBC :)

Quick Start
Some quick guides to show how JDBC interact with databases like MySQL, Oracle and PostgreSQL.

Connect to MySQL with JDBC driver
Here’s an example to show you how to connect to MySQL database via JDBC driver.
Connect to PostgreSQL with JDBC driver
Here is an example to show you how to connect to PostgreSQL database with JDBC driver.
Connect to Oracle DB via JDBC driver
Here’s an example to show you how to connect to Oracle database via JDBC driver.
JDBC & Statement
The “Statement” interface is used to execute a simple SQL statement with no parameters. For create, insert, update or delete statement, uses “Statement.executeUpdate(sql)“; select query, uses “Statement.executeQuery(sql)“.

JDBC Statement example – Create a table
Example to create a table in database.
JDBC Statement example – Insert a record
Example to insert a record into table.
JDBC Statement example – Update a record
Example to update a record in table.
JDBC Statement example – Delete a record
Example to delete a record from a table.
JDBC Statement example – Select list of the records
Example to select the entire records from a table, and iterate the records via a ResultSet object.
JDBC Statement example – Batch Update
Example to insert records in batch process, via JDBC Statement.
JDBC & PreparedStatement
The “PreparedStatement” interface is extended “Statement”, with extra feature to send a pre-compiled SQL statement with parameters. For create, insert, update or delete statement, uses “PreparedStatement.executeUpdate(sql)“; select query, uses “PreparedStatement.executeQuery(sql)“.

JDBC PreparedStatement example – Create a table
Example to create a table in database.
JDBC PreparedStatement example – Insert a record
Example to insert a record into table.
JDBC PreparedStatement example – Update a record
Example to update a record in table.
JDBC PreparedStatement example – Delete a record
Example to delete a record from a table.
JDBC PreparedStatement example – Select list of the records
Example to select records from a table, and iterate the records via a ResultSet object.
JDBC PreparedStatement example – Batch Update
Example to insert records in batch process, via JDBC PreparedStatement.
JDBC & Stored Procedure
JDBC CallableStatement and Stored Procedure, IN, OUT, CURSOR examples.

JDBC CallableStatement – Stored Procedure IN parameter example
Stored procedure IN parameter via JDBC CallableStatement.
JDBC CallableStatement – Stored Procedure OUT parameter example
Stored procedure OUT parameter via JDBC CallableStatement.
JDBC CallableStatement – Stored Procedure CURSOR example
Stored procedure CURSOR parameter via JDBC CallableStatement.
JDBC Transaction example
JDBC Trasaction how to :

JDBC Transaction example
Example to show you how to use JDBC Transaction.
JDBC Integration example
Integrate JDBC with other frameworks.

JSF 2.0 + JDBC integration example
Here’s a guide to show you how to integrate JSF 2.0 with database via JDBC. In this example, we are using MySQL database and Tomcat web container.
Spring + JDBC integration example
Many examples to show how to integarte Spring with JDBC.
