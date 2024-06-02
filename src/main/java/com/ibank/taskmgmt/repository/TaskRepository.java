package com.ibank.taskmgmt.repository;

import com.ibank.taskmgmt.entity.Task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>
{
    public Task findByTitle(String title);
}
