import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tạo database (hospital)
        // tạo bảng doctors ( id, doctor_name, gender, age, department )

        // yêu cầu nhập vào thông tin để thêm mới dữ liệu vào database
        // B1 : Mở kết nối
        try (Connection con = DatabaseConnection.openConnection()) {
            // B2 : Viết câu lệnh SQL
            String sql = "SELECT * FROM doctors WHERE code = ? AND pass = ?";
//            String sql = "INSERT INTO doctors VALUES (?,?,?,?,?)";
            // B3 : Khởi tạo đối tượng PreparedStatement
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            for (int i = 0; i < 2; i++) {
                // B4 : Set parameter (tham số) vào
                System.out.println("Nhập mã bác sĩ: ");
                preparedStatement.setString(1, sc.nextLine());
                System.out.println("Nhập tên bác sĩ: ");
                preparedStatement.setString(2, sc.nextLine());
                System.out.println("Nhập giới tính: ");
                preparedStatement.setString(3, sc.nextLine());
                System.out.println("Nhập tuổi: ");
                preparedStatement.setInt(4, Integer.parseInt(sc.nextLine()));
                System.out.println("Nhập khoa: ");
                preparedStatement.setString(5, sc.nextLine());
                // B5: thực thi câu lệnh
                int row = preparedStatement.executeUpdate();
                // Thực thi xong rồi thì phải set lại parameter về null
                preparedStatement.clearParameters();
                System.out.println(row);
            }


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}