package template_method_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TemplateMethodPatternTest {

    private Parent childA;
    private Parent childB;
    private Parent childC;


    @BeforeEach
    public void setup() {
        childA = new ChildA();
        childB = new ChildB();
        childC = new ChildC();
    }

    @AfterEach
    public void followup() {
        System.out.println("==========");
    }

    @Test
    public void childA_테스트() {
        childA.someMethod();
    }

    @Test
    public void childB_테스트() {
        childB.someMethod();
    }

    @Test
    public void childC_테스트() {
        childC.someMethod();
    }
}
