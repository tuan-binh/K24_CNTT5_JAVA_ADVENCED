package reference_method;

public class UserResp {
    private String fullName;
    private String email;
    private boolean gender;

    public UserResp(User user) {
        this.fullName = user.getFullName();
        this.email = user.getEmail();
        this.gender = user.isGender();
    }



    public UserResp(String fullName, String email, boolean gender) {
        this.fullName = fullName;
        this.email = email;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserResp{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
