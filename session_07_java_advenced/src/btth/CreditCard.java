package btth;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(String message) {
        System.out.println("Đã thành toán bằng credit card: "+message);
    }
}
