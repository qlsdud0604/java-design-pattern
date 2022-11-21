package decorator_pattern;

public class CheeseDecorator extends ToppingDecorator {

    public CheeseDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public String make() {
        return super.make() + addCheese();
    }

    public String addCheese() {
        return " + 치즈";
    }
}
