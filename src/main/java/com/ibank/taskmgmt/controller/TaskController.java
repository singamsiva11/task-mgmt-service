package com.ibank.taskmgmt.controller;

import com.ibank.taskmgmt.dto.TaskDto;
import com.ibank.taskmgmt.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/user/task")
    public TaskDto createTask(@RequestBody TaskDto task) {

        return taskService.createTask(task);

    }

    @GetMapping("/task")
    public TaskDto findTaskByTitle(@RequestParam(name = "title") String title) {

        return taskService.findTaskByTitle(title);

    }
}
