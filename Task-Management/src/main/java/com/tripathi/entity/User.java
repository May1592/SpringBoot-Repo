package com.tripathi.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USER_TABLE")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="USER_ID")
    private int userId;
    @Column(name="USER_NAME")
    private String username;
    @Column(name="USER_EMAIL")
    private String useremail;
    @Column(name="USER_ROLE")
    private String userrole;
    @OneToMany(mappedBy = "user")
    private Set<Task> tasks;

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }
}
