package com.tripathi.controller;

import com.tripathi.bean.Taskform;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model)
    {
        model.addAttribute("taskform" , new Taskform());
        return "createTask";
    }




    @ResponseBody
    @GetMapping("/hello" )
    public String hello()
    {
        return "hello";
    }

}
