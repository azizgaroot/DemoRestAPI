package com.example.demoRestAPI.Service;

import com.example.demoRestAPI.Repository.UsersRepository;
import com.example.demoRestAPI.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository repo;

//    List<Users> users = new ArrayList<>(Arrays.asList(
//            new Users("20007699", "0537977218", "Al Jawhara", "Garoot"),
//            new Users("20007888", "xxxxx", "Al ", "EY"),
//            new Users("e1", "xxxxx", "Al Shatti Dist", "Elm ")));


    public List<Users> getUsers(){
        return repo.findAll();

    }

    public Users getUserByID(String userId) {
        return repo.findById(userId).orElse(new Users());
    }

    public void addUser(Users user) {
        repo.save(user);
    }

    public void updateUser(Users user) {
        repo.save(user);
    }

    public void deleteUser(String userId) {
        repo.deleteById(userId);
    }
}
