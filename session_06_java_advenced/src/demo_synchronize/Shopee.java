package demo_synchronize;

public class Shopee extends Thread {
    private String customerName;
    private Warehouese warehouese;

    public Shopee() {
    }

    public Shopee(String customerName, Warehouese warehouese) {
        this.customerName = customerName;
        this.warehouese = warehouese;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Warehouese getWarehouese() {
        return warehouese;
    }

    public void setWarehouese(Warehouese warehouese) {
        this.warehouese = warehouese;
    }

    @Override
    public synchronized void run() {
        while (warehouese.getQuantiy() > 0) {
            System.out.println(customerName + " trước khi bán: " + warehouese.getQuantiy());
            warehouese.sellProduct();
            System.out.println(customerName + " sau khi bán: " + warehouese.getQuantiy());
        }
    }
}
