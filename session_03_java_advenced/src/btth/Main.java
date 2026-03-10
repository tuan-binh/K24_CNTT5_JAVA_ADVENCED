package btth;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        List<User> userList = new ArrayList<>(
                List.of(
                        new User("SV001", "Hà Bích N", "N123456", true, LocalDate.of(2024,3,10)),
                        new User("SV002", "Hồ Khánh L", "L123456", false, LocalDate.of(2025,3,10)),
                        new User("SV002", "Nguyễn Hữu D", "D123456", true, LocalDate.of(2026,1,20)),
                        new User("SV002", "Phạm Thái S", "S123456", false, LocalDate.of(2026,2,25)),
                        new User("SV002", "Lê Thanh T", "T123456", false, LocalDate.of(2025,5,10))
                )
        );

        List<User> userVerified = userService.getVerifiedUsers(userList);
        userVerified.forEach(System.out::println);

        List<PublicUser> publicUsers = userList.stream().map((u) -> {
            Period time = Period.between(u.getCreatedAt(),LocalDate.now());
            int month = 0;
            if(time.getYears() != 0) {
                month += time.getYears() * 12;
            }
            if(time.getMonths() != 0) {
                month += time.getMonths();
            }
            System.out.println(time.getMonths());
                    PublicUser user = new PublicUser(
                            u.getId(),
                            u.getEmail(),
                            userService.classifyTier(month)
                    );
                    return user;
                }
        ).toList();

        publicUsers.forEach(System.out::println);
    }
}
