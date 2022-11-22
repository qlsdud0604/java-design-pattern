package abstract_factory_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AbstractFactoryPatternTest {
    private static String LG = "LG";
    private static String SAMSUNG = "Samsung";

    private FactoryOfComputerFactory factory;

    @BeforeEach
    public void setup() {
        factory = new FactoryOfComputerFactory();
    }

    @AfterEach
    public void followup() {
        System.out.println("==========");
    }

    @Test
    public void LG_컴퓨터_테스트() {
        factory.createComputer(LG);
    }

    @Test
    public void Samsung_컴퓨터_테스트() {
        factory.createComputer(SAMSUNG);
    }
}
