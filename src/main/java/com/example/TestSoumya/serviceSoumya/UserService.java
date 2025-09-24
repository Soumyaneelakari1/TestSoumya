package com.example.TestSoumya.serviceSoumya;

import com.example.TestSoumya.entitySoumya.UserEntity;
import com.example.TestSoumya.repositorySoumya.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public UserEntity addUser(UserEntity userEntity)
    {
        return userRepository.save(userEntity);
    }

    public Optional<UserEntity> fetchUser(Integer id)
    {
        return userRepository.findById(id);
    }
}
