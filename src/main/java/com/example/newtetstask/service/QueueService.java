package com.example.newtetstask.service;

import java.util.List;
import com.example.newtetstask.model.Queue;

public interface QueueService {

    Queue save(Queue queue);

    List<Queue> findAll();

    Queue getById(Long id);

    Queue getByName(Queue name);

    void delete(Long id);
}
