package btth;

import java.util.List;

public class UserService {
    public List<User> getVerifiedUsers(List<User> users) {
        return users.stream().filter((u) -> u.getVerified()).toList();
    }

    public Tier classifyTier(int months) {
        if(months > 24) {
            return new Gold("gold");
        } else if (months > 12) {
            return new Silver("silver");
        } else {
            return new Bronze("bronze");
        }
    }
}
