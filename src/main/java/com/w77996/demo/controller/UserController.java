package com.w77996.demo.controller;

import com.w77996.demo.domain.User;
import com.w77996.demo.result.Result;
import com.w77996.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get/user")
    @ResponseBody
    public Result<User> getUserById(){
        User user = userService.getUserById(1);
        return Result.success(user);
    }
}
