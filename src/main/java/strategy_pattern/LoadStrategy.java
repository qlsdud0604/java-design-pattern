package strategy_pattern;

public class LoadStrategy implements MovableStrategy {

    @Override
    public String move() {
        return "도로를 통해 이동";
    }
}
