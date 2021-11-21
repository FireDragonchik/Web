package by.bsac.park.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "login",nullable = false)
    private String login;

    @Basic
    @Column(name = "password",nullable = false)
    private String password;

    @Basic
    @Column(name = "role_id",nullable = false)
    private Integer roleId;


    @OneToOne(mappedBy = "workerId",cascade = CascadeType.ALL)//мапид к чему
    @JsonIgnore
    private Work worker;

    @OneToOne(mappedBy = "adminId",cascade = CascadeType.ALL)//мапид к чему
    @JsonIgnore
    private Work admin;

//    @NotBlank
//    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private Collection<User> user;
}
