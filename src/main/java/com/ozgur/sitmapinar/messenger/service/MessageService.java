package com.ozgur.sitmapinar.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ozgur.sitmapinar.messenger.database.DatabaseClass;
import com.ozgur.sitmapinar.messenger.model.Message;

public class MessageService {

    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {

        this.messages.put(1L, new Message(1, "Hello world!", "Ozgur"));
        this.messages.put(2L, new Message(2, "Hello Jersey!", "Saban"));

    }

    public List<Message> getAllMessages() {
        return new ArrayList<Message>(this.messages.values());
    }

    public Message getMessage(long id) {
        return this.messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId(this.messages.size() + 1);
        this.messages.put(message.getId(), message);
        return message;

    }

    public Message updateMessage(Message message) {

        if (message.getId() <= 0) {
            return null;
        }

        this.messages.put(message.getId(), message);
        return message;

    }

    public Message removeMessage(long id) {

        return this.messages.remove(id);

    }

}
