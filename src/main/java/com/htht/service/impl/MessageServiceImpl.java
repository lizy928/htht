package com.htht.service.impl;

import com.htht.dao.MessageDao;
import com.htht.entity.Message;
import com.htht.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Lizhengyuan on 18-8-30
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public List<Message> getAll() {
        return messageDao.getAll();
    }

    @Override
    public Message getMessageById(int Id) {
        return messageDao.getMessageById(Id);
    }

    @Override
    public void updateMessage(Message message) {
        messageDao.updateMessage(message);
    }

    @Override
    public void deleteMessage(int Id) {
        messageDao.deleteMessageById(Id);
    }

    @Override
    public void addMessage(Message message) {
        messageDao.add(message);
    }
}
