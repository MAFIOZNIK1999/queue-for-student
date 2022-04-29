package com.example.newtetstask.service;

import com.example.newtetstask.model.User;

public interface AuthenticationService {
    User register(String username, String password);
}