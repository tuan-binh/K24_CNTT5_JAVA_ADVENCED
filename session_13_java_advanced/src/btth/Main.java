package btth;

import util.DataConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Thiết lập thủ tục xuất viện
        // - lập hoá đơn
        // - cập nhật trạng thái bệnh nhân
        // - cập nhật tình trạng giường bệnh
        Connection con = DataConnect.openConnect();
        int patientId = 101;
        try {
            con.setAutoCommit(false);
            // - lập hoá đơn
            String sqlInvoices = """
                    INSERT INTO invoices (patient_id, amount, created_date)
                    VALUE
                    (?,?,?)
                    """;
            // - cập nhật trạng thái bệnh nhân
            String sqlPatient = """
                    UPDATE patients SET status = ? WHERE id = ?
                    """;
            // - cập nhật tình trạng giường bệnh
            String sqlBed = """
                    UPDATE beds SET status = ? WHERE id = ?
                    """;
            PreparedStatement preparedInvoices = con.prepareStatement(sqlInvoices);
            preparedInvoices.setInt(1, patientId);
            preparedInvoices.setDouble(2, 10000000);
            preparedInvoices.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
            PreparedStatement preparedPatients = con.prepareStatement(sqlPatient);
            preparedPatients.setString(1, "ĐÃ XUẤT VIỆN");
            preparedPatients.setInt(2, patientId);
            PreparedStatement preparedBeds = con.prepareStatement(sqlBed);
            preparedBeds.setString(1, "TRỐNG");
            preparedBeds.setString(2, "G01");

            preparedInvoices.executeUpdate();
//            int result = 10 / 0;
            preparedPatients.executeUpdate();
            preparedBeds.executeUpdate();

            System.out.println("Đã xuất viện thành công");

            con.commit();
        } catch (SQLException e) {
            con.rollback();
            System.err.println(e.getMessage());
        } finally {
            con.close();
        }
    }
}
