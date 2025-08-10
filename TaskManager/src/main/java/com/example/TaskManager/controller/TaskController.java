package com.example.TaskManager.controller;

import com.example.TaskManager.model.Tasks;
import com.example.TaskManager.repository.TaskRepository;
import com.example.TaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

//    @GetMapping
//    public ResponseEntity<Tasks> getAllTasks() {
//        taskService.getTasks();
//    }


    
}
