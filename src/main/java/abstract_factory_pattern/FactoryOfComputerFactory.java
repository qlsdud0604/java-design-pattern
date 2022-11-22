package abstract_factory_pattern;

public class FactoryOfComputerFactory {
    public void createComputer(String type) {
        ComputerFactory factory = null;
        switch (type) {
            case "Samsung":
                factory = new SamsungComputerFactory();
                break;
            case "LG":
                factory = new LGComputerFactory();
                break;
        }

        factory.createKeyboard();
        factory.createMouse();

        System.out.println( type + " 컴퓨터 완성");
    }
}
