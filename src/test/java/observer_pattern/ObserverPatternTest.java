package observer_pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ObserverPatternTest {
    private User user;
    private List<String> messages;
    private static String MESSAGE = "안녕하세요.";

    @BeforeEach
    public void setup() {
        user = new User();

        user.attach(new ChatRoom("채팅방"));
        user.attach(new GameRoom("게임방"));
        user.attach(new DevRoom("개발방"));

        messages = user.notifyObservers(MESSAGE);
    }

    @Test
    public void 채팅방_메시지_전송_테스트() {
        Assertions.assertEquals("채팅방 : 안녕하세요.", messages.get(0));
    }

    @Test
    public void 게임방_메시지_전송_테스트() {
        Assertions.assertEquals("게임방 : 안녕하세요.", messages.get(1));
    }

    @Test
    public void 개발방_메시지_전송_테스트() {
        Assertions.assertEquals("개발방 : 안녕하세요.", messages.get(2));
    }


}
