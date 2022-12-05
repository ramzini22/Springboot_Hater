package com.example.demo.Entity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class UserSQL {
    @Id
    @Column(name = "id_user")
    int id;
    @Column
    String name;
    @Column
    String surname;
}
