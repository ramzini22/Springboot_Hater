package com.example.demo.Entity.User;

import com.example.demo.Entity.Hate;
import lombok.Data;
import org.apache.logging.log4j.util.Chars;

import java.util.Stack;

@Data
public class User{

    UserLinks userLinks;
    String name;
    String surname;
    Stack<Hate> hates=new Stack<>();
    public void setHate(Hate hate){
        hates.push(hate);
    }
}
