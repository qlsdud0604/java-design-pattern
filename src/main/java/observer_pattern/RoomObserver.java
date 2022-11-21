package observer_pattern;

public class RoomObserver {
    public String roomName;

    public String receive(String message) {
        return this.roomName + " : " + message;
    }
}
