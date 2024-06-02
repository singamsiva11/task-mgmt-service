package com.ibank.taskmgmt.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "TASK_MGMT")
public class Task{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private LocalDate dueDate;
}

