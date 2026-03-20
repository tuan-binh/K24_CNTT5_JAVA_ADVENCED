package btth;

public class Main {
    public static void main(String[] args) {
        /**
         * 1. Nhấn nút
         *      - bật đèn
         *      - tắt đèn
         *      - bật quạt
         *      - tắt quạt
         *      - điều chỉnh nhiệt độ điều hoà
         * 2. Undo
         * 3. Thoát
         * */

        Light light = new Light();
        Fan fan = new Fan();
        AC ac = new AC(25);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.addCommand(1, new TurnOnLightCommand(light));
        remoteControl.addCommand(2, new TurnOffLightCommand(light));
        remoteControl.addCommand(3, new TurnOnFanCommand(fan));
        remoteControl.addCommand(4, new TurnOffFanCommand(fan));
        remoteControl.addCommand(5, new ACCommand(ac, 25));

        remoteControl.pressButton(1);
        remoteControl.pressButton(2);
        remoteControl.pressBack();
        remoteControl.pressBack();

    }
}
