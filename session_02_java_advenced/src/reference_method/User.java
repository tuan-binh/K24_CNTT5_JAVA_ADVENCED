package reference_method;

import java.util.List;

public class User {
    private String fullName;
    private boolean gender;
    private String email;
    private String password;
    private List<String> images;

    public User() {
    }

    public User(String fullName, boolean gender, String email, String password, List<String> images) {
        this.fullName = fullName;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.images = images;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
