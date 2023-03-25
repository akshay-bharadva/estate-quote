

package com.logical.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Akshay
 */
public class ConnectionFactory {

    String dbUrl = "jdbc:mysql://localhost:3306/user";
    String dbUsername = "root";
    String dbPassword = "toor";

    public static Connection getMySQLConnection(final String URL, final String USERNAME, final String PASSWORD) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return connection;
    }

    public static void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }
}
