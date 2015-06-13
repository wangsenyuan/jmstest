package com.me.jmstest.server;

/**
 * Created by senyuanwang on 15/6/13.
 */
public class MessageProtocol {
    public String handleProtocolMessage(String messageText) {
        String responseText;
        if ("MyProtocolMessage".equalsIgnoreCase(messageText)) {
            responseText = "I recognize your protocol message";
        } else {
            responseText = "Unknown protocol message: " + messageText;
        }

        return responseText;
    }
}