package com.example.TestSoumya.repositorySoumya;

import com.example.TestSoumya.entitySoumya.UserEntitySoumya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntitySoumya,Integer> {


}
