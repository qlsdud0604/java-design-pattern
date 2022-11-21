package decorator_pattern;

public class ToppingDecorator extends Sandwich {
    private Sandwich sandwich;

    public ToppingDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make();
    }
}
