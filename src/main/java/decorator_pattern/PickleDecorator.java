package decorator_pattern;

public class PickleDecorator extends ToppingDecorator {

    public PickleDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String make() {
        return super.make() + addPickle();
    }

    private String addPickle() {
        return " + 피클";
    }
}