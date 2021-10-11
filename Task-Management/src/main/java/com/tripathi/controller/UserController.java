package com.tripathi.controller;

import com.tripathi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/users")
    public String getAllUser(Model model)
    {
        model.addAttribute("userList",userService.getAllUser());
        return  "showAllUser";
    }
}
