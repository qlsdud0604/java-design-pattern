package command_pattern;

public class OKGoogle {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String talk() {
        return command.run();
    }
}
