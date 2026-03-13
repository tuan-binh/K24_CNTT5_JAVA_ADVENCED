package btth;

public class TrainStation {
    private Integer quantity;

    public TrainStation() {
    }

    public TrainStation(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public synchronized void sellTicket(String boxOffice) {
        if (quantity > 0) {
            // Trước khi bán vé
            System.out.println("Số lượng vé trong khó = " + quantity);

            // Mô phỏng nhân viên thao tác trên máy tính mất 500 milis
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            // Sau khi bán vé
            quantity--;
            System.out.println("✅ " + boxOffice + " Đá bán được 1 vé, số lượng còn lại = " + quantity);
        } else {
            System.out.println("❌ Đã bán hết vé rồi!!!");
        }
    }

}
