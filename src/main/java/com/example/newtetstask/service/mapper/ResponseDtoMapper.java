package com.example.newtetstask.service.mapper;

public interface ResponseDtoMapper<R, M> {
    R mapToDto(M t);
}