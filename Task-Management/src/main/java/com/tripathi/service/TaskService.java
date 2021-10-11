package com.tripathi.service;

import com.tripathi.entity.Task;

import java.util.List;

public interface TaskService {
    public void addNewTask(Task task);
    public void updateTask(String taskId);
    public void deleteTask(String taskId);
    public Task getTaskByTaskId(String taskId);
    public List<Task> getAllTasks();
}


