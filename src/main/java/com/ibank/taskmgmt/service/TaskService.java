package com.ibank.taskmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibank.taskmgmt.dto.TaskDto;
import com.ibank.taskmgmt.entity.Task;
import com.ibank.taskmgmt.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public TaskDto createTask(TaskDto task) {
        Task entity = convertDtoToEntity(task);
        Task result = taskRepository.save(entity);
        TaskDto dto = convertEntityToDto(result);
        return dto;
    }


    public TaskDto findTaskByTitle(String title) {
        Task entity = taskRepository.findByTitle(title);
        return convertEntityToDto(entity);
    }

    private Task convertDtoToEntity(TaskDto dto) {
        Task entity = new Task();
        entity.setTitle(dto.getTitle());
        entity.setDescription(dto.getDescription());
        entity.setStatus(dto.getStatus());
        entity.setPriority(dto.getPriority());
        entity.setDueDate(dto.getDueDate());
        return entity;

    }

    private TaskDto convertEntityToDto(Task entity) {
        TaskDto dto = new TaskDto();
        dto.setTitle(entity.getTitle());
        dto.setDescription(entity.getDescription());
        dto.setStatus(entity.getStatus());
        dto.setPriority(entity.getPriority());
        dto.setDueDate(entity.getDueDate());

        return dto;

    }

}
