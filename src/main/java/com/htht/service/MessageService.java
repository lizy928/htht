package com.htht.service;

import com.htht.entity.Message;
import com.htht.entity.Product;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-29
 */
public interface MessageService {

    List<Message> getAll();

    Message getMessageById(int Id);

    void updateMessage(Message message);

    void deleteMessage(int Id);

    void addMessage(Message message);
}
