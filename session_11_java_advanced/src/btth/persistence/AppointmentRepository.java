package btth.persistence;

import btth.entity.Appointment;
import utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentRepository {

    private static AppointmentRepository instance;

    public static AppointmentRepository getInstance() {
        if (instance == null) {
            instance = new AppointmentRepository();
        }
        return instance;
    }

    // lấy về danh sách lịch hẹn
    public List<Appointment> getAllAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        // mở kết nối
        try (Connection connection = DatabaseConnection.openConnection()) {
            // câu lệnh sql
            String sql = "SELECT * FROM appointments";
            // tạo statement
            Statement statement = connection.createStatement();
            // thực thi câu lệnh SQL
            ResultSet rs = statement.executeQuery(sql);
            // gán kết quả cho java
            while (rs.next()) {
                Appointment appointment = new Appointment(
                        rs.getInt("id"),
                        rs.getString("patient_name"),
                        rs.getDate("appointment_date"),
                        rs.getString("doctor_name"),
                        rs.getString("status")
                );
                appointments.add(appointment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return appointments;
    }

    // lấy về thông tin đơn khám theo id
    public Appointment getAppointmentById(int id) {
        Appointment appointment = null;

        try (Connection connection = DatabaseConnection.openConnection()) {
            String sql = "SELECT * FROM appointments WHERE id = " + id;
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                appointment = new Appointment(
                        rs.getInt("id"),
                        rs.getString("patient_name"),
                        rs.getDate("appointment_date"),
                        rs.getString("doctor_name"),
                        rs.getString("status")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return appointment;
    }

    // thêm mới đơn khám
    public void addAppointment(Appointment appointment) {
        try (Connection connection = DatabaseConnection.openConnection()) {
            String sql = "INSERT INTO appointments (patient_name, appointment_date, doctor_name, status) VALUE ('" +
                    appointment.getPatientName() + "','"
                    + (new Date(appointment.getAppointmentDate().getTime())) + "','"
                    + appointment.getDoctorName() + "','"
                    + appointment.getStatus() + "')";
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
            if (row == 0) {
                System.err.println("Thêm không thành công");
            } else {
                System.out.println("Thêm thành công");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // cập nhật đơn khám
    public void updateAppointment(Appointment appointment) {

    }

    // xoá đơn khám
    public void deleteAppointment(int id) {

    }

}
