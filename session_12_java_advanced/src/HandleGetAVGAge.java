import util.DatabaseConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class HandleGetAVGAge {
    public static void main(String[] args) {
        try (Connection con = DatabaseConnection.openConnection()) {

            CallableStatement callableStatement = con.prepareCall(
                    "{call proc_get_avg_age_doctor(?)}"
            );
            // register đăng ký tham số out
            callableStatement.registerOutParameter(1, Types.DOUBLE);
            // thực thi câu lệnh
            callableStatement.executeQuery();
            // lấy giá trị của tham số OUT ở thủ tục
            Double result = callableStatement.getDouble(1);
            System.out.println(result);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
