package command_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CommandPatternTest {

    private OKGoogle okGoogle;

    @BeforeEach
    public void setup() {
        this.okGoogle = new OKGoogle();
    }

    @Test
    public void 히터_테스트() {
        okGoogle.setCommand(new HeaterOnCommand(new Heater()));
        Assertions.assertEquals("Heater ON", okGoogle.talk());
    }

    @Test
    public void 램프_테스트() {
        okGoogle.setCommand(new LampOnCommand(new Lamp()));
        Assertions.assertEquals("Lamp ON", okGoogle.talk());
    }
}
