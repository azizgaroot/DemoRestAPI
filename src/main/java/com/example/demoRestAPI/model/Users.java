package com.example.demoRestAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
public class Users {

    private String UserID;
    private String UserName;
    private String UserAddress;
    private String UserPhoneNumber;


    public Users() {
    }








}
