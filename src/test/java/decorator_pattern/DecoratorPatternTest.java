package decorator_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorPatternTest {

    @Test
    public void 양상추_샌드위치_테스트() {
        Sandwich sandwich = new LettuceDecorator(new Bread());
        Assertions.assertEquals("빵 + 양상추", sandwich.make());
    }

    @Test
    public void 피클_샌드위치_테스트() {
        Sandwich sandwich = new PickleDecorator(new Bread());
        Assertions.assertEquals("빵 + 피클", sandwich.make());
    }

    @Test
    public void 피클_양상추_샌드위치_테스트() {
        Sandwich sandwich = new PickleDecorator(new LettuceDecorator(new Bread()));
        Assertions.assertEquals("빵 + 양상추 + 피클", sandwich.make());
    }

    @Test
    public void 치즈_피클_양상추_샌드위치_테스트() {
        Sandwich sandwich = new CheeseDecorator(new PickleDecorator(new LettuceDecorator(new Bread())));
        Assertions.assertEquals("빵 + 양상추 + 피클 + 치즈", sandwich.make());
    }
}
