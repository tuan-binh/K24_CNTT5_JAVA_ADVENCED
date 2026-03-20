package btth.presentation;

import btth.entity.Appointment;
import btth.persistence.AppointmentRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        AppointmentRepository appointmentRepository = AppointmentRepository.getInstance();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("""
                        1. Hiển thị danh sách
                        2. tìm kiếm theo id
                        3. thêm mới
                        4. cập nhật
                        5. xoá
                        6. thoát
                        Lựa chọn của bạn:
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    appointmentRepository.getAllAppointments().forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Nhập vào id muốn tìm kiếm: ");
                    int idFind = Integer.parseInt(sc.nextLine());
                    Appointment appointment = appointmentRepository.getAppointmentById(idFind);
                    if (appointment == null) {
                        System.err.println("Không tìm thấy");
                    } else {
                        System.out.println(appointment);
                    }
                    break;
                case 3:
                    // nhập thông tin
                    System.out.println("Nhập vào tên bệnh nhân: ");
                    String patientName = sc.nextLine();
                    System.out.println("Nhập ngày khám bệnh: ");
                    Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse(sc.nextLine());
                    System.out.println("Nhập tên bác sĩ: ");
                    String doctorName = sc.nextLine();
                    // khởi tạo đối tượng
                    Appointment newAppointment = new Appointment();
                    newAppointment.setPatientName(patientName);
                    newAppointment.setAppointmentDate(appointmentDate);
                    newAppointment.setDoctorName(doctorName);
                    newAppointment.setStatus("PENDING");
                    // thực hiện gọi hàm sql thêm mới
                    appointmentRepository.addAppointment(newAppointment);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng lựa chọn đúng");
            }
        } while (true);

    }
}
