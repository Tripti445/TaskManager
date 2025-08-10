package com.example.TaskManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private BigInteger userId;

    private String username;

    private String password;

    private String email;

    @Column(name = "created_at")
    private Timestamp createdAt;

    private String role;

}
