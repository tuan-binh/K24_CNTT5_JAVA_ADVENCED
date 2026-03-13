package demo_synchronize;

public class Main {

    public static void main(String[] args) {

        Warehouese hadong = new Warehouese(10,"B Mega SOC");

        Shopee cellphoneS = new Shopee("CellphoneS",hadong);
        Shopee hoanghamobile = new Shopee("HoanghaMobile",hadong);
        cellphoneS.start();
        hoanghamobile.start();

    }
}
