package state_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StatePatternTest {
    private Laptop laptop;

    @BeforeEach
    public void setup() {
        this.laptop = new Laptop();
    }

    @Test
    public void 절전_모드_테스트() {
        laptop.setPowerState(new Off());
        Assertions.assertEquals("절전 모드", laptop.powerPush());
    }

    @Test
    public void 전원_off_테스트() {
        laptop.setPowerState(new On());
        Assertions.assertEquals("전원 off", laptop.powerPush());
    }

    @Test
    public void 전원_on_테스트() {
        laptop.setPowerState(new Saving());
        Assertions.assertEquals("전원 on", laptop.powerPush());
    }

}
