package com.example.admin.englishthinh.Model;

/**
 * Created by Admin on 11/29/2018.
 */

public class User {
    private String Name,Password,Phone;
    private boolean IsStaff;

    public User(String name, String password) {
        Name = name;
        Password = password;
        IsStaff = false;


    }

    public User() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public boolean getIsStaff() {
        return IsStaff;
    }

    public void setIsStaff(boolean isStaff) {
        IsStaff = isStaff;
    }
}
