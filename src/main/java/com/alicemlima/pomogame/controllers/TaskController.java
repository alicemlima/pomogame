package com.alicemlima.pomogame.controllers;

import com.alicemlima.pomogame.model.entities.Task;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

    @PostMapping
    public @ResponseBody Task newTask(@RequestParam String name) {
        Task task = new Task(name);
        return task;
    }
}
