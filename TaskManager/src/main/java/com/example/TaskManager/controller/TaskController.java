package com.example.TaskManager.controller;

import com.example.TaskManager.model.Tasks;
import com.example.TaskManager.repository.TaskRepository;
import com.example.TaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {


    private final TaskService taskService;


    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }


    @PostMapping("/{userId}")
    public ResponseEntity<String> addTask(@PathVariable Long userId ,  @RequestBody Tasks task)
    {

            taskService.createTask(userId,task);
            return new ResponseEntity<>("Task added Successfully", HttpStatus.CREATED);


    }

  @GetMapping
    public ResponseEntity<List<Tasks>> getTasks(){
      List<Tasks> tasks = taskService.getAllTasks();

      if(tasks.isEmpty())
      {
          return new ResponseEntity<>((tasks), HttpStatus.INTERNAL_SERVER_ERROR);
      }
      else {
          return ResponseEntity.ok(tasks);
      }
  }
    
}
