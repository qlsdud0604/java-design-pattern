package command_pattern;

public class HeaterOnCommand implements Command {
    private Heater heater;

    public HeaterOnCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public String run() {
        return this.heater.powerOn();
    }
}
