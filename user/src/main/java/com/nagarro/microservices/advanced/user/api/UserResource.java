package com.nagarro.microservices.advanced.user.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.microservices.advanced.user.dtos.User;

@RestController
public class UserResource {

	@GetMapping("user/1")
	public ResponseEntity<User> getMe() {
		return ResponseEntity.ok(new User("Chetan Mahajan", 24, "chetan.mahajan@nagarro.com"));
	}

}
