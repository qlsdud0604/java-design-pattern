package singleton_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SingletonPatternTest {

    private static SingleObject singleObject;

    @BeforeEach
    public void setup() {
        singleObject = SingleObject.getInstance();
    }

    @Test
    public void 싱글톤_패턴_테스트() {
        int expectedHashCode = singleObject.hashCode();

        for (int i = 0; i < 5; i++) {
            SingleObject tempSingleObject = SingleObject.getInstance();
            int actualHashCode = tempSingleObject.hashCode();

            Assertions.assertEquals(expectedHashCode, actualHashCode);
        }
    }
}
