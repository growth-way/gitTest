package com.queen.ssm.controller;

import com.queen.ssm.service.UserService;
import com.queen.ssm.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("hello")
    @ResponseBody
    public User hello(Integer userId) {
        User user = userService.queryUserByUserId(userId);
        return user;
    }

}
