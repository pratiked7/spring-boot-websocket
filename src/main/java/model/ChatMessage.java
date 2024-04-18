package model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {

    private String content;
    private String sender;
    private SenderStatus status;


    public enum SenderStatus{
        ONLINE, LEFT, JOINED
    }
}
