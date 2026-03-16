package btth;

/**
 * SRP
 * OCP
 * DIP
 *
 */
public class OrderProcessor {
    // DIP
    private final Database db;
    private final PaymentMethod paymentMethod;
    private final Notification notification;

    public OrderProcessor(Database db, PaymentMethod paymentMethod, Notification notification) {
        this.db = db;
        this.paymentMethod = paymentMethod;
        this.notification = notification;
    }

    public void processOrder(Order order) {
        // 1. Lưu vào Database
        db.save(order);

        // 2. Xử lý thanh toán - OCP
        paymentMethod.pay("Done");

        // 3. Gửi thông báo
        notification.handleSendNotification("Đã gửi thông báo thành công");
    }
}