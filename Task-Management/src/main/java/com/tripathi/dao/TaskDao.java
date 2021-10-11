package com.tripathi.dao;

import com.tripathi.entity.Task;

import java.util.List;


public interface TaskDao {
    public Task getTaskByTaskId(String taskId);
    public List<Task> getAllTask();
    public List<Task> getTaskByStatus(String status);
    public void createTask(Task task);
}
