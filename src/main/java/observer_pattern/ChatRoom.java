package observer_pattern;

public class ChatRoom extends RoomObserver {
    public ChatRoom(String roomName) {
        this.roomName = roomName;
    }
}
