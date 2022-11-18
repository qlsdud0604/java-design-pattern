package strategy_pattern;

public class Moving {
    private MovableStrategy movableStrategy;

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }

    public String move() {
        return movableStrategy.move();
    }
}
