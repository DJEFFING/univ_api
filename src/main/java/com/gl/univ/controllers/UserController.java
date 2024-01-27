package com.gl.univ.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.gl.univ.models.User;

import com.gl.univ.services.interfaces.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService  userService;


	@PostMapping("/create")
	public User create(@RequestBody User use) {
		return userService.save(use);
	}


	@GetMapping("/get")
	public List<User> getAll() {
		return userService.findAll();

	}

	@PutMapping("/update-{id}")
	public User update(@RequestBody User use, @PathVariable("id") final Integer id) {
		return userService.update(id, use);
	}

	@GetMapping("/find-{id}")
	public Optional<User> findById(@PathVariable("id") final Integer id) {
		return userService.findById(id);
	}


	@DeleteMapping("/delete-{id}")
	public String delete(@PathVariable("id") final Integer id) {
		return userService.delete(id);


	
}
}
