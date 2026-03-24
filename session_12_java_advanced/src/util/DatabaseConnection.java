package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // driver
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    // url
    private final static String URL = "jdbc:mysql://localhost:3307/hospital";
    // user
    private final static String USER = "root";
    // password
    private final static String PASSWORD = "123456";

    public static Connection openConnection() {
        Connection con;

        try {
            // Khai báo cho Class biết Driver
            Class.forName(DRIVER);

            // Mở kết nối
            con = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
