package state_pattern;

public class Saving implements PowerState {
    @Override
    public String powerPush() {
        return "전원 on";
    }
}
