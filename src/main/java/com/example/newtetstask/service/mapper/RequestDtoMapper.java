package com.example.newtetstask.service.mapper;

public interface RequestDtoMapper<R, M> {
    M mapToModel(R dto);
}