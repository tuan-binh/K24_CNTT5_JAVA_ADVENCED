package creational_pattern.factory;

public class Main {
    public static void main(String[] args) {
        Transport bus = TransportFactory.getTransport("BUS");
        Transport car = TransportFactory.getTransport("CAR");
    }
}
