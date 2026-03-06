import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        // Exception
        // Checked Exception:
//        File file = new File("D://Learning//");
//        FileReader fileReader = new FileReader();
//        try {
//            fileReader.read();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Unchecked Exception
//        int[] arr = new int[5];
//        arr[6] = 10;


        // try catch finally
        // try - khối lệnh để chạy nhưng nghi ngờ có thể xảy ra lỗi
        // catch - khối lệnh để bắt lỗi
//        try {
//            int a = 5;
//            int b = 0;
//            int c = a / b;
//        } catch (ArithmeticException e) {
////            e.printStackTrace();
//            System.err.println("Không thể chia được cho 0");
//        }

//        System.out.println("Vẫn chạy tiếp");

        Scanner sc = new Scanner(System.in);

//        System.out.println("Nhập vào tuổi: ");
//        int age = 0;
//        try {
//            age = inputInt(sc);
//        } catch (NumberFormatException e) {
//            System.err.println("Nhập nội dung sai định dạng");
//        }
//        System.out.println(age);

        // tại sao chúng ta không tạo ra 1 lớp chuyên để nhập
        // nhập chuỗi
        // nhập byte
        // nhập short
        // nhập int
        // nhập long
        // nhập float
        // nhập double

        System.out.println("Nhập vào tuổi bản thân: ");
        try {
            int myAge = inputAge(sc);
            System.out.println(myAge);
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close();
        }


    }

    public static int inputInt(Scanner sc) throws NumberFormatException {
        return Integer.parseInt(sc.nextLine());
    }

    public static int inputAge(Scanner sc) throws InvalidAgeException {
        do {
            try {
                int age = Integer.parseInt(sc.nextLine());
                if(age < 0) {
                    throw new InvalidAgeException("Age must be positive number") ;
                }
                if(age < 18) {
                    throw new InvalidAgeException("Age must be than 18");
                }
                return age;
            }catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập đúng định dạng số: ");
            }
        }while (true);
    }
}