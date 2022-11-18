package singleton_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonPatternTest {

    @Test
    public void 싱글톤_패턴_테스트() {
        for (int i = 0; i < 5; i++) {
            SingleObject singleObject = SingleObject.getInstance();
            System.out.println(singleObject.hashCode());
        }
    }
}
