package com.ibank.taskmgmt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {
    private Integer id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private LocalDate dueDate;
}
