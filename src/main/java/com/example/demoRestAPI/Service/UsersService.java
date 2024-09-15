package com.example.demoRestAPI.Service;

import com.example.demoRestAPI.model.Users;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {

    List<Users> users = Arrays.asList(
            new Users("20007699", "0537977218", "Al Jawhara", "Garoot"),
            new Users("e1", "xxxxx", "Al Shatti Dist", "Elm ") );

    public List<Users> getUsers(){
        return users;

    }

    public Users getUserByID(String userId) {
        return users.stream()
                .filter(u -> userId.equals(u.getUserID()))
                .findFirst().get();



    }
}
