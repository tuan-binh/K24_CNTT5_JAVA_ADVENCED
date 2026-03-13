package demo_thread;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Nhac Cua Tui Bat dau --- ");

        // Luồng nghe nhạc
        MusicPlayer nhaccuatui = new MusicPlayer("Cơn mưa ngang qua"); // NEW
        nhaccuatui.start();
        // Luồng tải bài nhạc
        Thread thread = new Thread(new FileDownload("Sóng gió"));
        thread.start();

        System.out.println("--- Lướt Phở bò ---");

    }
}
