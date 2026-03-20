import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        System.out.println("Chuẩn bị kết nối");

        // Mở kết nối
        Connection con = DatabaseConnection.openConnection();

        // Statement
        // viết câu lệnh sql lấy về danh sách
        String sql = "SELECT * FROM students";
        try {
            // khởi tạo statement
            Statement statement = con.createStatement();

            // execute() thực thi nhưng trả về boolean
            // executeQuery() thực thi những câu truy vấn
            // executeUpdate() thực thi trả về số bản ghi đã được thay đổi
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Student student = new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4)
                );
                students.add(student);
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // đóng kết nối
            // resultset
            // statement
            // connection
            DatabaseConnection.closeConnection(con);
        }

        students.forEach(System.out::println);



        try (Connection conn = DatabaseConnection.openConnection()) {
            // thực hiện thêm mới:
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập tên: ");
            String fullName = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập địa chỉ: ");
            String address = sc.nextLine();

            String sqlInsert = "INSERT INTO students (full_name, age, address) VALUE ('" + fullName + "'," + age + ",'" + address + "')";

            Statement handleInsert = null;
            handleInsert = conn.createStatement();
            int row = handleInsert.executeUpdate(sqlInsert);
            System.out.println(row);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Đã kết nối thành công");
    }
}