package btth;

class EmailSender implements Notification {
    @Override
    public void handleSendNotification(String message) {
        System.out.println("Đã gửi mail: " + message);
    }
}
