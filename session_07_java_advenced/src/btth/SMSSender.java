package btth;

public class SMSSender implements Notification {
    @Override
    public void handleSendNotification(String message) {
        System.out.println("Đã gửi tin nhắn: " + message);
    }
}
