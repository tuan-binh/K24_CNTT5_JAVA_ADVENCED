package demo_method_thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- VÀO GIỜ LÀM VIỆC ---");

        Worker hung = new Worker("Hưng", false);
        Worker linh = new Worker("Linh", true);
        hung.start();
        linh.start();

        hung.join();
        linh.join();

        System.out.println("--- ĐÃ TAN LÀM ---");
    }
}
