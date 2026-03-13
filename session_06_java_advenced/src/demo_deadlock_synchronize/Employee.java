package demo_deadlock_synchronize;

public class Employee implements Runnable {
    private String fullName;
    private Tool keep;
    private Tool need;

    public Employee() {
    }

    public Employee(String fullName, Tool keep, Tool need) {
        this.fullName = fullName;
        this.keep = keep;
        this.need = need;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Tool getKeep() {
        return keep;
    }

    public void setKeep(Tool keep) {
        this.keep = keep;
    }

    public Tool getNeed() {
        return need;
    }

    public void setNeed(Tool need) {
        this.need = need;
    }

    @Override
    public void run() {
        synchronized (keep) {
            System.out.println(fullName + " Đang cầm dụng cụ: " + keep.getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }

            synchronized (need) {
                System.out.println(fullName + " Đang cần dụng cụ: " + need.getName());
            }
        }
    }
}
