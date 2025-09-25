package com.example.TestSoumya.ControllerSoumya;

import com.example.TestSoumya.entitySoumya.UserEntitySoumya;
import com.example.TestSoumya.serviceSoumya.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserControllerSoumya {
    private static final Logger logger = LoggerFactory.getLogger(UserControllerSoumya.class);


    @Autowired
    public UserService userService;

    @PostMapping("/adduser")
    public ResponseEntity<UserEntitySoumya> add(@RequestBody UserEntitySoumya userEntitySoumya)
    {
        System.out.println(userEntitySoumya.getEmail());
        logger.info("Received request to add user with email: {}", userEntitySoumya.getEmail());

        return ResponseEntity.ok(userService.addUser(userEntitySoumya));
    }

    @GetMapping("/getuser/{id}")
    public Optional<UserEntitySoumya> findbyId(@PathVariable Integer id)
    {
        logger.info("Fetching user with ID: {}", id);
        return userService.fetchUser(id);
    }



}
