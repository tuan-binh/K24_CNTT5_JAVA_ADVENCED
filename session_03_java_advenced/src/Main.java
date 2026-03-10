import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nameOfStudents = new ArrayList<>();
        nameOfStudents.add("Đặng Tô Ngọc Dũng"); // Đặng tô ngọc dũng trai tài gái sắc
        nameOfStudents.add("Nguyễn Thành Tùng");
        nameOfStudents.add("Trần Thị Khánh Huyền");
        nameOfStudents.add("Đặng Văn Thắng"); // Thắng
        nameOfStudents.add("Nguyễn Hữu Dại"); // Đại
        nameOfStudents.add("Lê Thanh Tùng"); // Tùng
        System.out.println(nameOfStudents);

        Predicate<String> getName = (name) -> name.startsWith("Nguyễn");

        Function<String, String> convertName = (name) -> name + " trai tài gái sắc";

        Set<String> uniqueName = nameOfStudents.stream()
//                .filter(getName)
                .map((name) -> {
                    String[] fullName = name.split(" ");
                    return fullName[fullName.length - 1];
                })
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toSet());
        System.out.println(uniqueName);

        // sử dụng reduce
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        int sum = numbers.stream().reduce(0, (total, curr) -> total + curr);
        System.out.println(sum);

        List<Product> products = new ArrayList<>(List.of(
                new Product(10000.0, 5),
                new Product(15000.0, 3),
                new Product(20000.0, 3)
        ));

        double sumTotal = products.stream()
                .map((p) -> p.getQuantity() * p.getPrice())
                .reduce(0.0, (total, curr) -> total + curr);
        System.out.println(sumTotal);

        // anyMatch -> boolean
        // allMatch -> boolean
        // noneMatch -> boolean
        // min max
        // limit
        //
    }
}