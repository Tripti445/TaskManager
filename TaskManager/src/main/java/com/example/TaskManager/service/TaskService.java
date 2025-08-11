package com.example.TaskManager.service;

import com.example.TaskManager.model.Tasks;
import com.example.TaskManager.model.Users;
import com.example.TaskManager.repository.TaskRepository;
import com.example.TaskManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;


    public List<Tasks> getAllTasks(){

        return taskRepository.findAll();

    }
    public void createTask(Long userId, Tasks task) {

        Users users = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + userId));

        task.setUser(users);
        task.setCreatedAt(LocalDateTime.now());
        task.setStatus("Pending");
        taskRepository.save(task);
    }
}
