package factory_method_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactoryMethodPattern {

    private ClassA classA;

    @BeforeEach
    public void setup() {
        classA = new ClassA();
    }

    @AfterEach
    public void followup() {
        System.out.println("==========");
    }

    @Test
    public void TypeA_생성_테스트() {
        classA.createType("A");
    }

    @Test
    public void TypeB_생성_테스트() {
        classA.createType("B");
    }

    @Test
    public void TypeC_생성_테스트() {
        classA.createType("C");
    }
}
