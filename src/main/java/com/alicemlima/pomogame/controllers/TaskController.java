package com.alicemlima.pomogame.controllers;

import com.alicemlima.pomogame.model.entities.Task;
import com.alicemlima.pomogame.model.repositories.TaskRepository;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.io.Console;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    //TODO add @valid
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Task saveTask(@Validated Task task) {

        taskRepository.save(task);
        System.out.println(task.getName());
        return task;
    }
    @GetMapping
    public Iterable<Task> getTasks() {
        return taskRepository.findAll();
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTAsk(@PathVariable int id) {
        taskRepository.deleteById(id);
    }
//    @PutMapping
//    public Task updateTask(@Validated Task task) {
//        taskRepository.save(task);
//        return task;
//    }

//    @DeleteMapping
//    public
}
