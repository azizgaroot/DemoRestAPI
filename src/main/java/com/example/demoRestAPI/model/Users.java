package com.example.demoRestAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Users {

    private String UserID;
    private String UserName;
    private String UserAddress;
    private String UserPhoneNumber;


}
