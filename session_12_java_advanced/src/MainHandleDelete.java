import util.DatabaseConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainHandleDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // thao tác xoá bác sĩ
        // B1 : Nhập id của bác sĩ muốn xoá
        System.out.println("Nhập vào mã bác sĩ muốn xoá: ");
        String idDelete = sc.nextLine();
        // B2 : Mở kết nối
        try (Connection connection = DatabaseConnection.openConnection()) {
            // B3 : Gọi thủ tục
            CallableStatement callableStatement = connection.prepareCall(
                    "{call proc_delete_doctor_by_id(?)}"
            );
            callableStatement.setString(1,idDelete);
            // B4 :   Sử dụng đối tượng CallableStatement để gọi
            int row = callableStatement.executeUpdate();
            // B5 : Thực thi câu lệnh executeUpdate();
            System.out.println(row);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
