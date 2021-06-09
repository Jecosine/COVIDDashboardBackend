package com.catalina.infectious.controller;

import com.catalina.infectious.model.Response;
import com.catalina.infectious.model.User;
import com.catalina.infectious.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("/")
    public String test() {
        return "?????";
    }

    @ResponseBody
    @RequestMapping("/getById")
    public User getById(@RequestParam("id") String id) {
        return userService.getById(id);
    }

    @ResponseBody
    @RequestMapping("/update")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }

    @ResponseBody
    @RequestMapping("/deleteById")
    public int deleteById(@RequestParam("id") String id) {
        return userService.deleteById(id);
    }

    @ResponseBody
    @RequestMapping("/insert")
    public int insert(@RequestBody User user) {
        return userService.insert(user);
    }

    @ResponseBody
    @RequestMapping("/login")
    public Response<User> login(@RequestBody User user) {
        Response<User> result = new Response<User>();
        User target = userService.login(user);
        boolean loginState = target != null;
        result.status = loginState ? 0 : -1;
        result.message = loginState ? "Success" : "Failed";
        result.data = target;
        return result;
    }
}
