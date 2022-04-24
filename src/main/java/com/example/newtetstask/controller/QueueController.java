package com.example.newtetstask.controller;

import java.util.List;
import java.util.stream.Collectors;
import com.example.newtetstask.dto.response.QueueResponseDto;
import com.example.newtetstask.service.QueueService;
import com.example.newtetstask.service.mapper.QueueMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queue")
public class QueueController {
    private final QueueService service;
    private final QueueMapper mapper;

    public QueueController(QueueService service, QueueMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/")
    public List<QueueResponseDto> getAllQueue() {
        return service.findAll().stream()
                .map(mapper::mapToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("{id}")
    public QueueResponseDto getById(@PathVariable Long id) {
        return mapper.mapToDto(service.getById(id));
    }
}
