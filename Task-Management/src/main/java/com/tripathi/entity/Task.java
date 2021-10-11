package com.tripathi.entity;


import javax.persistence.*;

@Entity
@Table(name = "TASK_TABLE")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TASK_ID")
    private Integer taskId;
    @Column(name = "TASK_TITLE")
    private String taskTitle;
    @Column(name = "TASK_DESCRIPTION")
    private String taskDescription;
    @Column(name = "TASK_TYPE")
    @Enumerated(EnumType.STRING)
    private TaskType taskType;



    @Column(name = "TASK_STATUS")
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;
  //  @Column(name = "TASK_ID")
  //  private String assignedTo;
    @ManyToOne
    @JoinColumn(name = "USER_ID",nullable = false)
    private User user;

    public Task() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // private LocalDate createdOn;
  //  private LocalDate updatedOn;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /*public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }*/

    /*public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDate getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDate updatedOn) {
        this.updatedOn = updatedOn;
    }*/
}
