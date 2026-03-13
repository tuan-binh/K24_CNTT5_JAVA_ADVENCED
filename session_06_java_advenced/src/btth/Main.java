package btth;

public class Main {
    public static void main(String[] args) {
        // khởi tạo nhà ga
        TrainStation trainStation = new TrainStation(10);

        // Khởi tạo luồng quầy 1
        Thread boxA = new Thread(new BoxOffice("Box A",trainStation));
        // Khởi tạo luồng quầy 2
        Thread boxB = new Thread(new BoxOffice("Box B",trainStation));
        // Khởi tạo luồng quầy 3
        Thread boxC = new Thread(new BoxOffice("Box C",trainStation));

        boxA.start();
        boxB.start();
        boxC.start();

    }
}
