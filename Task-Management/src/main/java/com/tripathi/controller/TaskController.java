package com.tripathi.controller;

import com.tripathi.bean.Taskform;
import com.tripathi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TaskController {

    @Autowired
    private TaskService taskService;


    @RequestMapping(value = "/task",method = RequestMethod.POST)
    public String addNewTask(@ModelAttribute Taskform taskform, BindingResult bindingResult )
    {
        if (bindingResult.hasErrors())
        {
            return "createTask";
        }
        System.out.println(taskform.getTaskId());
        return "welcome";
    }

    @GetMapping("/task")
    public String getAllTasks(Model model)
    {
        model.addAttribute("tasks",taskService.getAllTasks());
        return  "showAllTask";
    }



}
