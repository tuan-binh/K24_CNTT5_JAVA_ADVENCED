package btth;

public class Main {
    static Database database = new Database();
    static Notification notification = new EmailSender();
    static PaymentMethod paymentMethod = new Paypal();

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(database, paymentMethod, notification);

        Order order = new Order("dai@gmail.com");

        orderProcessor.processOrder(order);

        System.out.println("Đã tạo được đơn hàng");
    }
}
