package com.example.newtetstask.service.impl;

import com.example.newtetstask.model.Role;
import com.example.newtetstask.repository.RoleRepository;
import com.example.newtetstask.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(Role role) {
        roleRepository.save(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleRepository.findRoleByName(roleName);
    }
}