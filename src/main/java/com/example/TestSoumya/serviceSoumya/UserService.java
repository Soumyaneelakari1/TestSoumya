package com.example.TestSoumya.serviceSoumya;

import com.example.TestSoumya.entitySoumya.UserEntitySoumya;
import com.example.TestSoumya.repositorySoumya.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public UserEntitySoumya addUser(UserEntitySoumya userEntitySoumya)
    {
        return userRepository.save(userEntitySoumya);
    }

    public Optional<UserEntitySoumya> fetchUser(Integer id)
    {
        return userRepository.findById(id);
    }
}
