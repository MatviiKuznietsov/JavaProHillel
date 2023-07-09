package HW22DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Load JDBC driver
            String host = System.getenv("JDBC_HOST");
            String dbName = System.getenv("JDBC_DB_NAME");
            String userName = System.getenv("JDBC_USER");
            String password = System.getenv("JDBC_PASSWORD");

            String url = String.format("%s/%s", host, dbName);
            return DriverManager.getConnection(url, userName, password);

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        }
        return null;
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection close");
        }
    }
}
