package singleton_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SingletonPatternTest {

    private SingleObject singleObject;

    @BeforeEach
    public void setup() {
        singleObject = SingleObject.getInstance();
    }

    @Test
    public void 싱글톤_패턴_테스트() {
        int hashCodeOfObject = singleObject.hashCode();
        for (int i = 0; i < 5; i++) {
            Assertions.assertEquals(hashCodeOfObject, singleObject.hashCode());
        }
    }
}
