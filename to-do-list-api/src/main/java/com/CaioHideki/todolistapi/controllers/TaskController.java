package com.CaioHideki.todolistapi.controllers;

import com.CaioHideki.todolistapi.models.Task;
import com.CaioHideki.todolistapi.models.dtos.TaskDTO;
import com.CaioHideki.todolistapi.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SuppressWarnings("unused")
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping
    public Task createTask(
            @RequestBody TaskDTO body
    ){
       return taskService.createTask(body);

    }

    @GetMapping
    public List<Task> getTasks(){
        return taskService.getTasks();
    }
}
