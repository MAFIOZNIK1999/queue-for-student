package com.example.newtetstask.service.mapper;

import java.util.stream.Collectors;
import com.example.newtetstask.dto.response.QueueResponseDto;
import com.example.newtetstask.model.Queue;
import com.example.newtetstask.model.User;
import org.springframework.stereotype.Component;

@Component
public class QueueMapper implements ResponseDtoMapper<QueueResponseDto, Queue> {

    @Override
    public QueueResponseDto mapToDto(Queue queue) {
        QueueResponseDto queueResponseDto = new QueueResponseDto();
        queueResponseDto.setId(queue.getId());
        queueResponseDto.setName(queue.getName());
        queueResponseDto.setUsersId(queue.getUsers().stream()
                .map(User::getId)
                .collect(Collectors.toList()));
        return queueResponseDto;
    }
}
