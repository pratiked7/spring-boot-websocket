package com.pratik.springbootwebsocket.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage {

    private String content;
    private String sender;
    private SenderStatus status;


    public enum SenderStatus{
        ONLINE, LEFT, JOINED
    }
}
