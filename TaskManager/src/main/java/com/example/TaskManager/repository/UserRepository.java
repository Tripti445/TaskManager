package com.example.TaskManager.repository;

import com.example.TaskManager.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserRepository extends JpaRepository<Users, Long> {
}
