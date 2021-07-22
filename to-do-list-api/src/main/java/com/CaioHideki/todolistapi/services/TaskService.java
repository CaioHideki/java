package com.CaioHideki.todolistapi.services;

import com.CaioHideki.todolistapi.models.Task;
import com.CaioHideki.todolistapi.models.dtos.TaskDTO;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@SuppressWarnings("unused")

public class TaskService {
    private final List<Task> tasks = new ArrayList<>();


    public Task createTask(
            TaskDTO body
    ) {
        Task newTask = new Task(
                body.getTitle(),
                body.getDate(),
                body.getDescription()
        );
        tasks.add(newTask);
        return newTask;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
