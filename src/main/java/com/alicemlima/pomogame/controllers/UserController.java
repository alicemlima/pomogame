package com.alicemlima.pomogame.controllers;

import com.alicemlima.pomogame.model.entities.User;
import com.alicemlima.pomogame.model.repositories.TaskRepository;
import com.alicemlima.pomogame.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public @ResponseBody User newUser(@Validated User user){
        System.out.println(user.getEmail());
        userRepository.save(user);
        System.out.println(user.getEmail());
        return user;
    }

    @GetMapping
    public Iterable<User> getUser() {
        return userRepository.findAll();
    }
}
