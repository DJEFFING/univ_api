package com.gl.univ.controllers;

import java.util.List;
import java.util.Optional;

import com.gl.univ.models.Role;
import com.gl.univ.services.interfaces.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("roles/")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	//creation haveSpecialty
	@PostMapping("/")
	private Role create(@RequestBody Role role) {
		return roleService.save(role);
		
	}
	
	//listing  haveSpecialty
	@GetMapping("/")
	private List<Role> getAll(){
		return roleService.findAll(); 	
	}
	
	//suppression d'une haveSpecialty
	@DeleteMapping("/delete-{id}")
	private String delete(@PathVariable("id") int id){
		return  roleService.deleteById(id);
	}
	
	//listing haveSpecialty par id
	@GetMapping("/find-{id}")
	private Optional<Role> findById(@PathVariable("id") int id) {
		return roleService.findById(id);
	}
	
	//update haveSpecialty
	@PutMapping("/update-{id}")
	private Role update(@PathVariable("id") int id, @RequestBody Role role) {
		return roleService.update(id, role);
		
	}
}
