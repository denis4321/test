package com.app.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class MyTopicListener1 {

    @JmsListener(destination = "topicNameA", containerFactory = "myTopicFactory")
    public void onMessage(Message message){
        System.out.println(message);
    }
}
