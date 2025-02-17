package com.ics.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ics.test.entity.User;
import com.ics.test.service.UserService;

/**
 * User controller
 * 
 * @author Vyom Gangwar
 **/

@RestController
@RequestMapping("/usertestpro")


public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		return ResponseEntity.ok("hello for request through api gateway!!!");
	}

	@PostMapping("/register")
	public ResponseEntity<String> create(@RequestBody User userInput) {
		return userService.register(userInput);
	}

	@GetMapping("/list/{id}")
	public ResponseEntity<?> list(@PathVariable Integer id) {
		return userService.list(id);
	}

}
