package com.example.demoRestAPI.controller;


import com.example.demoRestAPI.model.Users;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Users")
public class UsersAPIService {

    Users user1;

    @GetMapping("{UserID}")
    public Users getUsersDetails(String UserID)
    {
        return user1;
//                new Users("e20007699", "0537977218", "Al Jawhara", "Garoot");
    }

    @PostMapping
    public String createUsersDetails(@RequestBody Users user1){

        this.user1 = user1;
        return "User Created Successfully!";
    }
}
