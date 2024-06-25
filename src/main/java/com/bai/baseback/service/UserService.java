package com.bai.baseback.service;

import com.bai.baseback.entity.User;

import java.util.List;

public interface UserService {

    List<User> list();

    void save(User user);

    void update(User user);

    User find(int id);
}
