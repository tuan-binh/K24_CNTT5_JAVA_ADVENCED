package demo_thread;

public class MusicPlayer extends Thread {
    private String musicName;

    public MusicPlayer() {
    }

    public MusicPlayer(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    @Override
    public void run() {
        System.out.println("[ Music Player ] Đang chuẩn bị mở bài hát...");

        for (int i = 0; i < 5; i++) {
            System.out.println("[ Music Player ] " + musicName + " đang phát nhạc...");
            // sử dụng sleep - mô phỏng thời gian chạy mỗi lần 1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println("[ Music Player ] Đã phát xong bài nhạc ...");
    }
}
