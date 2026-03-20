package creational_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();
        person.setFullName("Nguyễn Ngọc Ngạn");
        person.setAge(70);
        System.out.println(person);
    }
}
