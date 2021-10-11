package com.tripathi.dao;

import com.tripathi.entity.Task;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TaskDaoImpl extends BaseDaoImpl implements TaskDao {

    @Override
    public Task getTaskByTaskId(String taskId) {
        return getSession().load(Task.class,taskId);
    }

    @Override
    public List<Task> getAllTask() {
      List<Task> taskList = getSession().createQuery("from Task").list();
       return taskList;
      //  return null;
    }

    @Override
    public List<Task> getTaskByStatus(String status) {
        return null;
    }

    @Override
    public void createTask(Task task) {
        if(task!=null)
        {
            create(task);
        }
    }

    /*@Override
    @SuppressWarnings("unchecked")
    public List<Task> getAllTask() {
        return getSession().createQuery("from Task").list();
    }

    public List<Task> getTaskByStatus(String status)
    {
        return getSession().createQuery("from Task where status = :status").setParameter("status",status).list();
    }*/
}
