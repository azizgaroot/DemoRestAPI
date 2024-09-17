package com.example.demoRestAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@Component
@Entity
public class Users {

    @Id
    private String UserID;
    private String UserName;
    private String UserAddress;
    private String UserPhoneNumber;


    public Users() {
    }








}
