package com.example.demo.Entity;
import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "links")
public class Links {
    @Id
    @GeneratedValue
    String link_user;
    @Column(name="id_user")
    int idUser;

//    @ManyToOne
//    @JoinColumn(name = "id_user")
//    UserSQL user;


}
//    @ManyToOne(targetEntity = UserSQL.class,fetch = FetchType.EAGER)