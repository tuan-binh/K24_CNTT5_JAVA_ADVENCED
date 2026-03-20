package creational_pattern.factory;

public class Bus implements Transport{
    @Override
    public void drive() {
        System.out.println("Đang lái xe buýt");
    }
}
