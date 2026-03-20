package creational_pattern.factory;

public class Car implements Transport{
    @Override
    public void drive() {
        System.out.println("Đang lại xe con");
    }
}
