package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<RoomObserver> observers = new ArrayList<RoomObserver>();

    /** 옵저버 추가 */
    public void attach(RoomObserver observer) {
        observers.add(observer);
    }

    /** 옵저버 삭제 */
    public void detach(RoomObserver observer) {
        observers.remove(observer);
    }

    /** 옵저버들에게 알림 */
    public List<String> notifyObservers(String message) {
        List<String> messages = new ArrayList<String>();
        for (RoomObserver observer : observers) {
            messages.add(observer.receive(message));
        }
        return messages;
    }
}
