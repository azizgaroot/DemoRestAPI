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



    public Users() {
    }

    public Users(String userID, String userPhoneNumber, String userAddress, String userName) {
        UserID = userID;
        UserPhoneNumber = userPhoneNumber;
        UserAddress = userAddress;
        UserName = userName;
    }


    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserAddress() {
        return UserAddress;
    }

    public void setUserAddress(String userAddress) {
        UserAddress = userAddress;
    }

    public String getUserPhoneNumber() {
        return UserPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        UserPhoneNumber = userPhoneNumber;
    }
}
