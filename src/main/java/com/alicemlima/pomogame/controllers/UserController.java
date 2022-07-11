package com.alicemlima.pomogame.controllers;

import com.alicemlima.pomogame.model.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/new-user")
public class UserController {

    @PostMapping
    public @ResponseBody User newUser(@RequestParam String name, String email){
        User user = new User(name, email);
        return user;
    }
}
