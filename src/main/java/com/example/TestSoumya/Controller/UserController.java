package com.example.TestSoumya.Controller;

import com.example.TestSoumya.entity.UserEntity;
import com.example.TestSoumya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/adduser")
    public ResponseEntity<UserEntity> add(@RequestBody UserEntity userEntity)
    {
        System.out.println(userEntity.getEmail());
        return ResponseEntity.ok(userService.addUser(userEntity));
    }

    @GetMapping("/getuser/{id}")
    public Optional<UserEntity> findbyId(@PathVariable Integer id)
    {
        return userService.fetchUser(id);
    }



}
