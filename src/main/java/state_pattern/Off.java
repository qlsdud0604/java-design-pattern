package state_pattern;

public class Off implements PowerState {
    @Override
    public String powerPush() {
        return "절전 모드";
    }
}
