package state_pattern;

public class On implements PowerState {
    @Override
    public String powerPush() {
        return "전원 off";
    }
}
