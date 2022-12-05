package com.example.demo.Dao;

import com.example.demo.Entity.Hate;
import com.example.demo.Entity.User.User;
import com.example.demo.Entity.User.UserLinks;

import java.util.ArrayList;
import java.util.HashMap;
public class DaoUsers {
    HashMap<Integer, User> users = new HashMap<>();
    ArrayList<HashMap<String, Integer>> links=new ArrayList<>();    // объект будет содержать 3 коллекци: vk, telegram, instagram
    public DaoUsers() {

        for(int i=0;i<3;i++)
            links.add(new HashMap<String, Integer>());

        for (int i = 1; i < 10; i++) {             //  создаём юзеров
            User user = new User();
            UserLinks userLink = new UserLinks();


            userLink.setId(i);
            userLink.getLinks().put(0, "vk:" + i);
            userLink.getLinks().put(1, "tl:" + i);
            userLink.getLinks().put(2, "inst:" + i);

            user.setUserLinks(userLink);


            for(int n=0;n<3;n++)
                links.get(n).put(user.getUserLinks().getLinks().get(n), user.getUserLinks().getId());
            user.setName("Name" + i);
            user.setSurname("Surrname" + i);
            for (int j=1;j<i+1;j++) {                             //  создаём хейты для юзера
                Hate hate=new Hate();
                hate.setId(j);
                hate.setIcon("1");
                hate.setText("This is the test hate, u should wait for real hate!!! ");
                hate.setType(1);
                for (int k=1;k<3;k++){                          // добавляем хэштеги
                    Hate.Hashtag hashtag=new Hate.Hashtag();
                    hashtag.setId(1);
                    hashtag.setHashtag("Hashtag "+i%(k+j));
                    hate.setHashtags(k,hashtag);
                }
                for (int k=1;k<3;k++){                          // добавляем реакции на хейт
                    Hate.Reaction reaction=new Hate.Reaction();
                    reaction.setId(k);
                    reaction.setSize(k*j*i);
                    hate.setReactions(k,reaction);
                }
                user.setHate(hate);
            }
            users.put(user.getUserLinks().getId(), user);
        }
    }

//    public UserInfForSearch userInfForSearch(String link){
//        int id=getUserIdByLink(link);
//        User user=users.get(id);
//        return new UserInfForSearch(user.getName(), user.getSurname());
//    }

    public int getUserIdByLink(String link){
        for(int i=0;i<3;i++){
            Object id=links.get(i).get(link);
            if(id!=null)
                return (Integer)id;
        }
        return 0;
    }
    public User getUser(int id){
        return users.get(id);
    }
}
