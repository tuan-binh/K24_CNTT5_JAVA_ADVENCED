package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3307/medicalAppointmentsDB?createDatabaseIfNotExist=true"; // phụ thuộc vào port mysql của mọi người
    private final static String USERNAME = "root";
    private final static String PASSWORD = "123456";

    // phương thức mở kết nối
    public static Connection openConnection() {
        Connection connection;
        try {
            Class.forName(DRIVER); // khai báo cho java biết driver

            // mở kết nối đến database
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    // phương thức đóng kết nối
    public static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // Repository - thủ kho
        // DAO - Data Access Object
    }

}
