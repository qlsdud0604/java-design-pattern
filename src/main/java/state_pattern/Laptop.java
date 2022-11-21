package state_pattern;

public class Laptop {
    public PowerState powerState;

    public Laptop() {
        setPowerState(new Off());
    }

    public void setPowerState(PowerState powerState) {
        this.powerState = powerState;
    }

    public String powerPush() {
        return powerState.powerPush();
    }

}
