package decorator_pattern;

public class LettuceDecorator extends ToppingDecorator {

    public LettuceDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String make() {
        return super.make() + addLettuce();
    }

    private String addLettuce() {
        return " + 양상추";
    }
}