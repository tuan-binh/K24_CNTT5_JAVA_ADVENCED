package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
//        Person tung = new Person(1,"Tùng",19);

        Person tung = null;

        Optional<Person> optionalPerson = Optional.ofNullable(tung);
        optionalPerson.ifPresent(person -> {
            System.out.println(person);
        }); // mặc định tồn tại thì mới được vào ifPresent

        Person getPerson = optionalPerson.orElse(null);
        Person getPersonOrElseGet = optionalPerson.orElseGet(() -> new Person(0,"Mặc định",0));
        System.out.println(getPersonOrElseGet);

        Person orElseThrowMy = optionalPerson.orElseThrow(() -> new RuntimeException("Tùng thực chất chưa đi học mà đang ngủ"));

        System.out.println(orElseThrowMy);



    }
}
