package strategy_pattern;

public class RailLoadStrategy implements MovableStrategy {

    @Override
    public String move() {
        return "선로를 통해 이동";
    }
}
