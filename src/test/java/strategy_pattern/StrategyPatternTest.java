package strategy_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StrategyPatternTest {

    private Moving train;
    private Moving bus;

    @BeforeEach
    public void setup() {
        this.train = new Train();
        this.bus = new Bus();
    }

    @Test
    public void 기차_이동_테스트() {
        train.setMovableStrategy(new RailLoadStrategy());
        Assertions.assertEquals("선로를 통해 이동", train.move());

        train.setMovableStrategy(new LoadStrategy());
        Assertions.assertEquals("도로를 통해 이동", train.move());
    }

    @Test
    public void 버스_이동_테스트() {
        bus.setMovableStrategy(new RailLoadStrategy());
        Assertions.assertEquals("선로를 통해 이동", bus.move());

        bus.setMovableStrategy(new LoadStrategy());
        Assertions.assertEquals("도로를 통해 이동", bus.move());
    }
}
