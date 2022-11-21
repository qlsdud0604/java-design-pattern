package command_pattern;

public class LampOnCommand implements Command {
    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public String run() {
        return this.lamp.turnOn();
    }
}
