package com.example.demo.Entity.User;

import lombok.Data;

public class UserInfForSearch{
    public int id;
    public String name;
    public String surname;

    public UserInfForSearch(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}