package com.java.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {
    private ConnectionProvider() {}

    public static Connection connection = null;
    public static synchronized Connection getConnection() {
        if (connection == null) {
            try {
                // TODO: change !YOURUSER! and !YourPassword! to your respective values
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/hibernate", "!YOURUSER!", "!YOurPassword!");
                return connection;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return connection;
    }
}
