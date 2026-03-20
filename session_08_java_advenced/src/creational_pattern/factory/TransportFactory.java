package creational_pattern.factory;

public class TransportFactory {
    public static Transport getTransport(String type) {
        if (type.equals("CAR")) {
            return new Car();
        }
        if (type.equals("BUS")) {
            return new Bus();
        }
        return null;
    }
}
