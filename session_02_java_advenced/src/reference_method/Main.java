package reference_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // User --> UserResp
        User nguyenKhacHung = new User(
                "Nguyễn Khắc Hưng",
                true,
                "hung@gmail.com",
                "hung@123456",
                new ArrayList<>(List.of("Ảnh 1","Ảnh 2"))
        );

        User hoKhanhLinh = new User(
            "Hồ Khánh Linh",
            false,
            "linh@gmail.com",
            "linhxinhcute@123",
            new ArrayList<>(List.of("Ảnh 1","Ảnh 2"))
        );

        User buiVanPhuong = new User(
                "Bùi Văn Phương",
                true,
                "phuong@gmail.com",
                "phuongduongtinh",
                new ArrayList<>(List.of("Ảnh 1","Ảnh 2"))
        );

        List<User> users = new ArrayList<>(List.of(nguyenKhacHung,hoKhanhLinh,buiVanPhuong));
        List<UserResp> userResps = new ArrayList<>(users.stream().map(UserResp::new).toList());
        userResps.sort(Comparator.comparing(UserResp::getFullName));
        System.out.println(userResps);
    }
}
