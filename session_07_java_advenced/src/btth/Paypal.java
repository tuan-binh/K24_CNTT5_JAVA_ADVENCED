package btth;

public class Paypal implements PaymentMethod {
    @Override
    public void pay(String message) {
        System.out.println("Đã thanh toán bằng Paypal: "+message);
    }
}
