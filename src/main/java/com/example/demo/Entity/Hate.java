package com.example.demo.Entity;

import lombok.Data;

import java.util.HashMap;

@Data
public class Hate {
    int id;
    String icon;
    String text;
    int type;
    HashMap <Integer, Hashtag> hashtags=new HashMap<>();
    HashMap<Integer,Reaction> reactions=new HashMap<>();
    public void setHashtags(int i, Hashtag hashtag) {
        hashtags.put(i, hashtag);
    }
    public void setReactions(int k, Reaction reaction) {
        reactions.put(k, reaction);
    }
    @Data
    public static class Hashtag{
        int id;
        String hashtag;
    }
    @Data
    public static class Reaction{
        int id;
        int size;
    }

}
