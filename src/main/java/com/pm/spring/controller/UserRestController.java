package com.pm.spring.controller;

import com.pm.spring.entity.User;
import com.pm.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/users")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        return new ResponseEntity<User>(userService.save(user), HttpStatus.OK);
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> findAllUsers(){
        return new ResponseEntity<List<User>>(userService.findAllUsers(),HttpStatus.OK);
    }
}
