package com.example.newtetstask.service.impl;

import java.util.HashSet;
import com.example.newtetstask.model.User;
import com.example.newtetstask.repository.RoleRepository;
import com.example.newtetstask.repository.UserRepository;
import com.example.newtetstask.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(()
                -> new RuntimeException("Can't find user by username: " + username));
    }
}
