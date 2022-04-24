package com.example.newtetstask.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
