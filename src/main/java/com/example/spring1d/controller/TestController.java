package com.example.spring1d.controller;
import com.example.spring1d.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@RestController
public class TestController {
    @RequestMapping(value = "/postTest1",method = RequestMethod.POST)
    public String postTest1(@RequestBody User user){
        System.out.println("username"+ user.getUsername());
        System.out.println("password"+user.getPassword());
        return "测试POST请求";
    }
}
