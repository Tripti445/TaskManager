package com.example.TaskManager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class TaskController {

    List<String> names = new ArrayList<>(List.of("Tripti", "Ruchit", "Sarthak", "Sangram"));

    @GetMapping("/names")
    public ResponseEntity<List<String>> getNames() {
        return new ResponseEntity<>(names, HttpStatus.OK);
    }
    
}
