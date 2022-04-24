package com.example.newtetstask.service.impl;

import java.util.List;
import com.example.newtetstask.model.Queue;
import com.example.newtetstask.repository.QueueRepository;
import com.example.newtetstask.service.QueueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QueueServiceImpl implements QueueService {
    private final QueueRepository queueRepository;

    @Override
    public Queue save(Queue queue) {
        return queueRepository.save(queue);
    }

    @Override
    public List<Queue> findAll() {
        return queueRepository.findAll();
    }

    @Override
    public Queue getById(Long id) {
        return queueRepository.getById(id);
    }

    @Override
    public Queue getByName(Queue name) {
        return queueRepository.findAll()
                .stream()
                .filter(n -> n.equals(name))
                .findFirst()
                .orElseThrow(() ->
                        new RuntimeException("Can't find queue by name: " + name));
    }

    @Override
    public void delete(Long id) {
        queueRepository.delete(queueRepository.getById(id));
    }
}
