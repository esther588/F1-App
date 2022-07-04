package com.esther588.F1App.entity;

import lombok.*;

import java.util.Set;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @ManyToMany(mappedBy = "Roles")
    private Set<User> users;
}
