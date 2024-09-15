package com.example.demoRestAPI.controller;

import com.example.demoRestAPI.Service.UsersService;
import com.example.demoRestAPI.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersService service ;

    @RequestMapping("/Users")
    public List<Users> getUsers(){
        return service.getUsers();
    }

    @GetMapping(value = "/Users/{userId}")
    public Users getUsersByID(@PathVariable String userId){
        return service.getUserByID(userId);
    }
}
