package com.example.demoRestAPI.controller;

import com.example.demoRestAPI.Service.UsersService;
import com.example.demoRestAPI.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UsersController {

    @Autowired
    UsersService service ;


    @GetMapping(value = "{userId}")
    public Users getUsersByID(@PathVariable String userId){
        return service.getUserByID(userId);
    }

    @GetMapping
    public List<Users> getUsers(){
        return service.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody Users user){
        System.out.println(user);
        service.addUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody Users user){
        service.updateUser(user);
    }

    @DeleteMapping(value = "{userId}")
    public void deleteUser(@PathVariable String userId){
        service.deleteUser(userId);
    }

}
