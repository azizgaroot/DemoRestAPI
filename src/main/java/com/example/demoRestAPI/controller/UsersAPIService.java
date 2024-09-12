package com.example.demoRestAPI.controller;


import com.example.demoRestAPI.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Users")
public class UsersAPIService {

    @GetMapping("{UserID}")
    public Users getUsersDetails(String UserID)
    {
        return new Users("e20007699", "0537977218", "Al Jawhara", "Garoot");
    }


}
