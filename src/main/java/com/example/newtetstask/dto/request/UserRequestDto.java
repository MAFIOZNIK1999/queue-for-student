package com.example.newtetstask.dto.request;

import java.util.Set;
import lombok.Data;

@Data
public class UserRequestDto {
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Long> roles;
}
