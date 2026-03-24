package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
    // DRIVER
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    // URL
    private final static String URL = "jdbc:mysql://localhost:3307/my_hospital?createDatabaseIfNotExist=true";
    // USER
    private final static String USER = "root";
    // PASSWORD
    private final static String PASSWORD = "123456";

    public static Connection openConnect() {
        Connection con;
        try {
            // Khai báo Driver
            Class.forName(DRIVER);
            // mở kết nối
            con = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }


}
