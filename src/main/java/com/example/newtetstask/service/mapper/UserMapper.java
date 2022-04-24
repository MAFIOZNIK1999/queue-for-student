package com.example.newtetstask.service.mapper;

import com.example.newtetstask.dto.request.UserRequestDto;
import com.example.newtetstask.dto.response.UserResponseDto;
import com.example.newtetstask.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements RequestDtoMapper<UserRequestDto, User>,
        ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public User mapToModel(UserRequestDto requestDto) {
        User user = new User();
        user.setUsername(requestDto.getUsername());
        user.setPassword(requestDto.getPassword());
        user.setPasswordConfirm(requestDto.getPasswordConfirm());
        return user;
    }

    @Override
    public UserResponseDto mapToDto(User student) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(student.getId());
        responseDto.setUsername(student.getUsername());
        responseDto.setPassword(student.getPassword());
        responseDto.setPasswordConfirm(student.getPasswordConfirm());
        return responseDto;
    }
}
