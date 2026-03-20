package behavioral_pattern.command;

public class RemoteControl {
    Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
