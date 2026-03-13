package demo_thread;

public class FileDownload implements Runnable {
    private String fileName;

    public FileDownload() {
    }

    public FileDownload(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("[ Download ] Đang chuẩn bị tải bài hát");

        for (int i = 20; i <= 100; i += 20) {
            System.out.println("[ Downloading ] Đang tải bài hát " + fileName + " - " + i + "%");
            // mô phỏng về thời gian
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println("[ Download ] Đã tải xong bài hát");
    }
}
