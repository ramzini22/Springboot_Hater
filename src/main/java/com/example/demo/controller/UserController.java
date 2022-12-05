package com.example.demo.controller;

import com.example.demo.Dao.DaoUsers;
import com.example.demo.Entity.User.User;
import com.example.demo.Repository.LinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    LinksRepository linksRepository;

//    public UserController(){
//        System.out.println(linksRepository.findAll());
//    }
    DaoUsers daoUsers = new DaoUsers();

    @GetMapping("/user")
    public User getUserById(
            @RequestParam("id") int id
    ){
        try {
            Thread.currentThread().sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        User user=daoUsers.getUser(id);
        return user;
    }


    @GetMapping("/getUserByLink")
    public User getUserByLink(
            @RequestParam("link") String link
    ) {
        int id = daoUsers.getUserIdByLink(link);
        try {
            Thread.currentThread().sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        if(id!=0){
            User user = getUserById(id);
            return user;
        }
        else return null;
    }
}
