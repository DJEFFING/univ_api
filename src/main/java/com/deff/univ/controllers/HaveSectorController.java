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

import com.deff.univ.models.HaveSector;
import com.deff.univ.services.implementation.HaveSectorServiceImp;
import com.deff.univ.services.interfaces.HaveSectorService;

@RestController
public class HaveSectorController {
	@Autowired
	private HaveSectorService haveSectorService;
	
	//creation des filières
	@GetMapping("/createhavesector")
	@ResponseBody 
	private HaveSector createhavesector(@RequestBody HaveSector haveSector) {
		
		return haveSectorService.save(haveSector);
		
	}
	
	//listing des filières
	@GetMapping("/gethavesector")
	private List<HaveSector> getAllhavesector(){
		return haveSectorService.getHave(); 	
	}
	
	//suppression d'une filière
	@DeleteMapping("/deletehavesector/{id}")
	private ResponseEntity<String> deletehavesector(@PathVariable("id") int id){
		haveSectorService.deleteById(id);
		
		return ResponseEntity.ok("HaveSector has deleted");
		
	}
	
	//listing filière par id
	@GetMapping("/gethavesectorById/{id}")
	private Optional<HaveSector> getHaveSectorById(@PathVariable("id") int id) {
		return haveSectorService.findById(id);
	}
	
	//update filière
	@PutMapping("/updatehavesector/{id}")
	private HaveSector updatehavesector(@PathVariable("id") int id, @RequestBody HaveSector haveSector) {
		return haveSectorService.update(id, haveSector);
		
	}
	
	
}

