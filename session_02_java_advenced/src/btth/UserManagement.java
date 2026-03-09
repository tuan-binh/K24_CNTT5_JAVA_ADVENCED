package btth;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UserManagement {

    public User createUser() {
        Supplier<User> handleCreateUser = () -> {
            return new User(
                    "Tạ Xuân Chiến",
                    "chien@gmail.com",
                    "USER",
                    "ACTIVE"
            );
        };
        return handleCreateUser.get();
    }

    public boolean checkStatusUser(User user) {
        Predicate<User> checkStatus = (u) -> u.getStatus().equals("ACTIVE");
        return checkStatus.test(user);
    }

    public String getEmailByUser(User user) {
        Function<User, String> getEmail = (u) -> u.getEmail();
        return getEmail.apply(user);
    }

}
