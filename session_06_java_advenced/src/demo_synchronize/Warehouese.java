package demo_synchronize;

public class Warehouese {
    private Integer quantiy;

    private String name;

    public Warehouese() {
    }

    public Warehouese(Integer quantiy, String name) {
        this.quantiy = quantiy;
        this.name = name;
    }

    public Integer getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(Integer quantiy) {
        this.quantiy = quantiy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void sellProduct() {
        if(quantiy > 0) {
            quantiy--;
        } else {
            System.err.println("Đã hết hàng");
        }
    }
}
