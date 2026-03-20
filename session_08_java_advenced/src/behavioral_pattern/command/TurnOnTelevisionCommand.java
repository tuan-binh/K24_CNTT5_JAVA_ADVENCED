package behavioral_pattern.command;

public class TurnOnTelevisionCommand implements Command{

    Television television;

    public TurnOnTelevisionCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
