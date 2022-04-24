package com.example.newtetstask.dto.response;

import java.util.List;
import lombok.Data;

@Data
public class QueueResponseDto {
    private Long id;
    private String name;
    private List<Long> usersId;
}
