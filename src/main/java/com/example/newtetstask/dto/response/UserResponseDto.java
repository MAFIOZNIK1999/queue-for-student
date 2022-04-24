package com.example.newtetstask.dto.response;

import java.util.Set;
import lombok.Data;

@Data
public class UserResponseDto {
    private long id;
    private String username;
    private String password;
    private String passwordConfirm;
    private Set<Long> roles;
}
