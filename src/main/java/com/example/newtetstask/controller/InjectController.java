package com.example.newtetstask.controller;

import com.example.newtetstask.model.Role;
import com.example.newtetstask.service.AuthenticationService;
import com.example.newtetstask.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inject")
@AllArgsConstructor
public class InjectController {
    private RoleService roleService;
    private AuthenticationService authenticationService;

    @GetMapping
    public String injectData() {
        roleService.save(new Role("ADMIN"));
        roleService.save(new Role("USER"));
        authenticationService.register("bob@i.ua", "1234");
        return "Done!!!";
    }
}
