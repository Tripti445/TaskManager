package com.example.TaskManager.repository;


import com.example.TaskManager.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Tasks, Long> {

}
