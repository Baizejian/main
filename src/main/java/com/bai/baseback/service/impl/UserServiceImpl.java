package com.bai.baseback.service.impl;

import com.bai.baseback.dao.UserRepository;
import com.bai.baseback.entity.User;
import com.bai.baseback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userDao;


    @Override
    public List<User> list() {
        return userDao.findAll();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User find(int id) {
        return null;
    }
}
