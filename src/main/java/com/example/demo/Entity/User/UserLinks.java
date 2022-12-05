package com.example.demo.Entity.User;


import lombok.Data;

import java.util.HashMap;

@Data
public class UserLinks {

    int id;
    HashMap<Integer, String> links=new HashMap<>();    // 0 - vk, 1 - tl, 2 - inst
}
