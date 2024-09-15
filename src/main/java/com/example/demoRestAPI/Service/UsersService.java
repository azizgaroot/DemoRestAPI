package com.example.demoRestAPI.Service;

import com.example.demoRestAPI.model.Users;

import java.util.Arrays;
import java.util.List;

public class UsersService {

    List<Users> users = Arrays.asList(new Users("e20007699", "0537977218", "Al Jawhara", "Garoot"), new Users("e1", "xxxxx", "Al Shatti Dist", "Elm ") );

    public List<Users> getUsers(){
        return null;

    }
}
