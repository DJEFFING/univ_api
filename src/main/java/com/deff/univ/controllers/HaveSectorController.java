package com.deff.univ.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.deff.univ.models.HaveSector;
import com.deff.univ.services.implementation.HaveSectorServiceImp;

@RestController
public class HaveSectorController {
	@Autowired
	private HaveSectorServiceImp haveSectorServiceImpl;
	
	//creation des filières
	@GetMapping("/createhavesector")
	@ResponseBody 
	private HaveSector createhavesector(@RequestBody HaveSector haveSector) {
		
		return haveSectorServiceImpl.save(haveSector);
		
	}
	
	//listing des filières
	@GetMapping("/gethavesector")
	private List<HaveSector> getAllhavesector(){
		return haveSectorServiceImpl.getHave(); 
		
	}
	
	//suppression d'une filière
	
	private ResponseEntity<String> deletehavesector(int id){
		haveSectorServiceImpl.deleteById(id);
		
		return ResponseEntity.ok("HaveSector has deleted");
		
	}
	
	
	
	
}

