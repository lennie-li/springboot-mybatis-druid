package com.lennie.spring_boot_mybatis.controller;

import com.lennie.spring_boot_mybatis.domain.User;
import com.lennie.spring_boot_mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private final UserService userService;

    @Autowired
    public TestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(@RequestParam("id") int id) {
        return userService.getUserById(id);
    }
}
