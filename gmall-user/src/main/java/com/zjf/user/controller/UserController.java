package com.zjf.user.controller;

import com.zjf.user.bean.UmsMember;
import com.zjf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zjf
 * @create 2020/2/1-9:23
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
}
