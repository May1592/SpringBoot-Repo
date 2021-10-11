package com.tripathi.service;

import com.tripathi.dao.TaskDao;
import com.tripathi.entity.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
   private TaskDao taskDao;

    @Override
    public void addNewTask(Task task) {

    }

    @Override
    public void updateTask(String taskId) {

    }

    @Override
    public void deleteTask(String taskId) {

    }

    @Override
    public Task getTaskByTaskId(String taskId) {
        return null;
    }

    @Override
    public List<Task> getAllTasks() {

        return taskDao.getAllTask();
    }
}
