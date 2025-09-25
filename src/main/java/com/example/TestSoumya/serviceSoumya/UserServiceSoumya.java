package com.example.TestSoumya.serviceSoumya;

import com.example.TestSoumya.entitySoumya.UserEntitySoumya;
import com.example.TestSoumya.repositorySoumya.UserRepositorySoumya;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceSoumya {
    @Autowired
    public UserRepositorySoumya userRepositorySoumya;

    public UserEntitySoumya addUser(UserEntitySoumya userEntitySoumya)
    {
        return userRepositorySoumya.save(userEntitySoumya);
    }

    public Optional<UserEntitySoumya> fetchUser(Integer id)
    {
        return userRepositorySoumya.findById(id);
    }
}
