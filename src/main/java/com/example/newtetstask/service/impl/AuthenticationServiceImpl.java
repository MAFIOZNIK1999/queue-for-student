package com.example.newtetstask.service.impl;

import java.util.Set;
import com.example.newtetstask.model.Role;
import com.example.newtetstask.model.User;
import com.example.newtetstask.service.AuthenticationService;
import com.example.newtetstask.service.RoleService;
import com.example.newtetstask.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final RoleService roleService;

    public AuthenticationServiceImpl(UserService userService,
                                     RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @Override
    public User register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        Role role = roleService.getRoleByName("USER");
        user.setRoles(Set.of(role));
        userService.save(user);
        return user;
    }
}
