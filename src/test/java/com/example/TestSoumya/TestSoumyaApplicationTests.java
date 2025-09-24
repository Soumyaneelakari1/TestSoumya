package com.example.TestSoumya;

import com.example.TestSoumya.ControllerSoumya.UserController;
import com.example.TestSoumya.entitySoumya.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestSoumyaApplicationTests {

	@Autowired
	private UserController userController;

	@Test
	void testAddUser() {
		UserEntity user = new UserEntity();
//		user.setUserid(10);
		user.setUsername("Alice");
		user.setEmail("alice@example.com");
		user.setPhoneno("1234567890");

		var response = userController.add(user);

		assertNotNull(response);
		assertEquals("alice@example.com", response.getBody().getEmail());
	}

	@Test
	void testFindById() {
		// Create user without setting ID (let DB generate it)
		UserEntity user = new UserEntity();
		user.setUsername("Bob");
		user.setEmail("bob@example.com");
		user.setPhoneno("0987654321");

		// Save user and get the saved entitySoumya (with generated ID)
		UserEntity savedUser = userController.add(user).getBody();

		// Now fetch by the generated ID
		Optional<UserEntity> fetchedUser = userController.findbyId(savedUser.getUserid());

		assertTrue(fetchedUser.isPresent());
		assertEquals("Bob", fetchedUser.get().getUsername());
	}

}
