package com.example.TestSoumya.ControllerSoumya;

import com.example.TestSoumya.entitySoumya.UserEntity;
import com.example.TestSoumya.serviceSoumya.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    public UserService userService;

    @PostMapping("/adduser")
    public ResponseEntity<UserEntity> add(@RequestBody UserEntity userEntity)
    {
        System.out.println(userEntity.getEmail());
        logger.info("Received request to add user with email: {}", userEntity.getEmail());

        return ResponseEntity.ok(userService.addUser(userEntity));
    }

    @GetMapping("/getuser/{id}")
    public Optional<UserEntity> findbyId(@PathVariable Integer id)
    {
        logger.info("Fetching user with ID: {}", id);
        return userService.fetchUser(id);
    }



}
