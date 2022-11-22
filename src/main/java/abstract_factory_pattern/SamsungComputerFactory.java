package abstract_factory_pattern;

public class SamsungComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
