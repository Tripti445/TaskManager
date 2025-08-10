package com.example.TaskManager.repository;


import com.example.TaskManager.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface TaskRepository extends JpaRepository<Tasks, BigInteger> {

    List<Tasks> findByTaskId(BigInteger taskId);
}
