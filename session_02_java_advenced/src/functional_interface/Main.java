package functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        Calculate calculate = (number) -> {
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if(number % i == 0) return false;
//            }
//            return true;
//        };
//
//        System.out.println(calculate.isPrime(9));

        // Predicate --> kiểm tra điều kiện (nhận vào 1 giá trị --> trả về boolean)
        Predicate<Integer> checkEven = (number) -> number % 2 == 0;
        System.out.println(checkEven.test(3));

        // Function<A,B> --> chuyển đổi từ A -> B (1 giá trị) --> trả về 1 giá trị mới
        Function<String, String> doHongKy = (name) -> name + " về nhuộm lại tóc đi giống con lửng mật";
        System.out.println(doHongKy.apply("Đỗ Hồng Kỳ"));


//        List<Integer> num = new ArrayList<>(Arrays.asList(3,2,6,1,4));


        // Consumer --> xử lý hành nhưng ko trả về
        Consumer<String> haBichNgoc = (name) -> {
            System.out.println(name + " một người bí thư mẫu mực luôn hết lòng vì bạn bè, nhưng bạn bè lại thờ ơ không đại lại, cần phải mạnh dạn, uy quyền, trách nghiệm");
        };
        haBichNgoc.accept("Hà Bích Ngọc");

        // sử dụng forEach()

        // Supplier --> ko nhận vào gì nhưng trả về 1 giá trị
        Supplier<Double> randomOTP = () -> Math.floor((Math.random() * 900000) + 100000);
        System.out.println(randomOTP.get());


    }
}
