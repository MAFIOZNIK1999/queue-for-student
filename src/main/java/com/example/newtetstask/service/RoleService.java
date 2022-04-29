package com.example.newtetstask.service;

import com.example.newtetstask.model.Role;

public interface RoleService {
    void save(Role role);

    Role getRoleByName(String roleName);
}