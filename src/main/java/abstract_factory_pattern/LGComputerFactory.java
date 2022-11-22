package abstract_factory_pattern;

public class LGComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
