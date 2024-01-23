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

import com.deff.univ.services.interfaces.HaveSpecialtyService;

@RestController
public class HaveSpecialtyController {
	@Autowired
	private HaveSpecialtyService haveSpecialtyService;
	
	//creation haveSpecialty
	@GetMapping("/createhavespecialty")
	@ResponseBody 
	private HaveSpecialty createhavespecialty(@RequestBody HaveSpecialty haveSpecialty) {
		
		return haveSpecialtyService.save(haveSpecialty);
		
	}
	
	//listing  haveSpecialty
	@GetMapping("/gethavespecialty")
	private List<HaveSpecialty> getAllhavespecialty(){
		return haveSpecialtyService.getHave(); 	
	}
	
	//suppression d'une haveSpecialty
	@DeleteMapping("/deletehavespecialty/{id}")
	private ResponseEntity<String> deletehavespecialty(@PathVariable("id") int id){
		haveSpecialtyService.deleteById(id);
		
		return ResponseEntity.ok("HaveSpecialty has deleted");
		
	}
	
	//listing haveSpecialty par id
	@GetMapping("/gethavespecialtyById/{id}")
	private Optional<HaveSpecialty> getHaveSpecialtyById(@PathVariable("id") int id) {
		return haveSpecialtyService.findById(id);
	}
	
	//update haveSpecialty
	@PutMapping("/updatehavespecialty/{id}")
	private HaveSpecialty updatehavespecialty(@PathVariable("id") int id, @RequestBody HaveSpecialty haveSpecialty) {
		return haveSpecialtyService.update(id, haveSpecialty);
		
	}
}
