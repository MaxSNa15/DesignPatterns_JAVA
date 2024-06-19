package Connection;

import java.sql.*;

public class ConnectDB {
    private static Connection conn = null;

    private ConnectDB() {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "Konatta#04";
    
    try {
        Class.forName(driver);
        conn = DriverManager.getConnection(url, userName, password);
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    }

    public static Connection getConnection() {
        if (conn == null) {
            new ConnectDB();
        }
        return conn;
    }
}
