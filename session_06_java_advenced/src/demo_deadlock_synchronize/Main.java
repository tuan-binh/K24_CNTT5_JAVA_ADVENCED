package demo_deadlock_synchronize;

public class Main {
    public static void main(String[] args) {
        Tool bienban = new Tool("Biên bản");
        Tool but = new Tool("Bút bi");

        Employee ngoc = new Employee("Hà Bích Ngọc", bienban, but);
        Employee linh = new Employee("Hồ Khánh Linh", bienban, but);
        Thread vieccuangoc = new Thread(ngoc);
        Thread vieccualinh = new Thread(linh);
        vieccuangoc.start();
        vieccualinh.start();
    }
}
