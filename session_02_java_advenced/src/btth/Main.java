package btth;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();

        User chien = userManagement.createUser();

        // kiểm tra username có hợp lệ hay không
        String username = chien.getUsername();

        boolean isUsername = IUserAccount.isStandardLength(username);
        System.out.println(isUsername);

        String email = userManagement.getEmailByUser(chien);
        System.out.println(email);

        User ngoc = new User(
                "Hà Bích Ngọc",
                "ngoc@gmail.com",
                "SUBADMIN",
                "ACTIVE"
        );

        User linh = new User(
                "Hồ Khánh Linh",
                "linh@gmail.com",
                "USER",
                "ACTIVE"
        );

        User dai = new User(
                "Nguyễn Hữu Đại",
                "dai@gmail.com",
                "USER",
                "ACTIVE"
        );

        User son = new User(
                "Phạm Thái Sơn",
                "son@gmail.com",
                "USER",
                "ACTIVE"
        );

        User tung = new User(
                "Lê Thanh Tùng",
                "tung@gmail.com",
                "USER",
                "ACTIVE"
        );

        List<User> users = new ArrayList<>(List.of(ngoc,linh,dai,son,tung));
        users.forEach(System.out::println); // Sử dụng Reference Method



    }
}
