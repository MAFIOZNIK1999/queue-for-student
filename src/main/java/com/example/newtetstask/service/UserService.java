package com.example.newtetstask.service;

import com.example.newtetstask.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);

}
