package com.example.TaskManager.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "tasks_categories")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TasksCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;


    @Column(name = "category_id")
    private Long categoryId;
}
