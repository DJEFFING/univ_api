package com.deff.univ.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.deff.univ.models.HaveSpecialty;
import com.deff.univ.models.Role;
import com.deff.univ.services.interfaces.HaveSpecialtyService;
import com.deff.univ.services.interfaces.RoleService;
@RestController
public class RoleController {
	@Autowired
	private RoleService   roleService;
	
	//creation haveSpecialty
	@GetMapping("/createrole")
	@ResponseBody 
	private Role createrole(@RequestBody Role role) {
		
		return roleService.save(role);
		
	}
	
	//listing  haveSpecialty
	@GetMapping("/getrole")
	private List<Role> getAllrole(){
		return roleService.findAll(); 	
	}
	
	//suppression d'une haveSpecialty
	@DeleteMapping("/deleterole/{id}")
	private ResponseEntity<String> deleterole(@PathVariable("id") int id){
		roleService.deleteById(id);
		
		return ResponseEntity.ok("role has deleted");
		
	}
	
	//listing haveSpecialty par id
	@GetMapping("/getroleById/{id}")
	private Optional<Role> getroleById(@PathVariable("id") int id) {
		return roleService.findById(id);
	}
	
	//update haveSpecialty
	@PutMapping("/updaterole/{id}")
	private Role updaterole(@PathVariable("id") int id, @RequestBody Role role) {
		return roleService.update(id, role);
		
	}
}
