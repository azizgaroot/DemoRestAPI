package com.example.demoRestAPI.Service;

import com.example.demoRestAPI.model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UsersService {

    List<Users> users = new ArrayList<>(Arrays.asList(
            new Users("20007699", "0537977218", "Al Jawhara", "Garoot"),
            new Users("20007888", "xxxxx", "Al ", "EY"),
            new Users("e1", "xxxxx", "Al Shatti Dist", "Elm ")));


    public List<Users> getUsers(){
        return users;

    }

    public Users getUserByID(String userId) {
        return users.stream()
                .filter(u -> userId.equals(u.getUserID()))
                .findFirst().get();
    }

    public void addUser(Users user) {
        users.add(user);
    }

    public void updateUser(Users user) {
        int index=0;
        for(int i = 0 ; i < users.size(); i++){
            if(users.get(i).getUserID() == user.getUserID())
                index = i;
        }
        users.set(index,user);
    }

    public void deleteUser(String userId) {
        int index=0;
        for(int i = 0 ; i < users.size(); i++) {

            if (users.get(i).getUserID() == userId)
//                System.out.println(userId +" vs " +users.get(i).getUserID() );
                index = i;
        }
        users.remove(index);
    }
}
