package srp;

public class CalculateArea {

    // VI PHẠM VỀ SRP
    public void getArea(String shape) {
        if(shape.equals("HCN")) {
            System.out.println("Tính toán hình chữ nhật");
        } else if (shape.equals("HV")) {
            System.out.println("Tính toán hình vuông");
        } else if (shape.equals("HT")) {
            System.out.println("Tính toán diện tích hình tròn");
        }
    }

}
