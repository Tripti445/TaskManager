package com.example.TaskManager.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "tasks_categories")
@NoArgsConstructor
@AllArgsConstructor
public class TasksCategories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private BigInteger taskId;


    @Column(name = "category_id")
    private BigInteger categoryId;
}
