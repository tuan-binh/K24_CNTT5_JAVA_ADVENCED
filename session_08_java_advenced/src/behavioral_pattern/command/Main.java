package behavioral_pattern.command;

public class Main {
    public static void main(String[] args) {
        Light denPhongKhach = new Light();
        Light denPhongNgu = new Light();

        Television tvPhongKhach = new Television();

        RemoteControl remoteControl = new RemoteControl(
                new TurnOnLightCommand(denPhongKhach)
        );

        RemoteControl handleTelevision = new RemoteControl(
                new TurnOnTelevisionCommand(tvPhongKhach)
        );

        remoteControl.pressButton();
        handleTelevision.pressButton();
    }
}
