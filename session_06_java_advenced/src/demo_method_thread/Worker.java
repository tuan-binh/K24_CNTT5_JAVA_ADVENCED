package demo_method_thread;

public class Worker extends Thread {
    private String fullName;
    private Boolean isPolite; // độ lịch sự

    public Worker() {
    }

    public Worker(String fullName, Boolean isPolite) {
        this.fullName = fullName;
        this.isPolite = isPolite;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getPolite() {
        return isPolite;
    }

    public void setPolite(Boolean polite) {
        isPolite = polite;
    }

    @Override
    public void run() {
        System.out.println("[ Worker: " + fullName + " ] Bắt đầu làm việc");

        for (int i = 0; i < 5; i++) {
            if (isPolite) {
                Thread.yield();
                System.out.println("[ Worker: " + fullName + " (Lịch sự) ] Đang làm bước: " + (i + 1));
            } else {
                System.out.println("[ Worker: " + fullName + " (Không lịch sự) ] Đang làm bước: " + (i + 1));
            }
        }

        System.out.println("[ Worker: " + fullName + " ] Đã hoàn thành công việc");
    }
}
