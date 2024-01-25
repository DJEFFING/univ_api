package com.deff.univ.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.deff.univ.models.TrainingCenter;
import com.deff.univ.services.interfaces.TrainingCenterService;

@RestController
public class TrainingCenterController {
	@Autowired
	private TrainingCenterService trainingCenterService;
	
	//creation TrainingCenter
		@PostMapping("/createtrainingCenter")
		@ResponseBody 
		private TrainingCenter createtrainingCenter(@RequestBody TrainingCenter trainingCenter) {
			
			return trainingCenterService.save(trainingCenter);
			
		}
		
		//listing TrainingCenter
		@GetMapping("/gettrainingCenter")
		private List<TrainingCenter> getAlltrainingCenter(){
			return trainingCenterService.findAll(); 	
		}
		
		//suppressionTrainingCenter
		@DeleteMapping("/deletetrainingCenter/{id}")
		private ResponseEntity<String> deletetrainingCenterr(@PathVariable("id") int id){
			trainingCenterService.deleteById(id);
			
			return ResponseEntity.ok("trainingCenter has deleted");
			
		}
		
		//listing trainingCenter par id
		@GetMapping("/gettrainingCenterById/{id}")
		private Optional<TrainingCenter> gettrainingCenterById(@PathVariable("id") int id) {
			return trainingCenterService.findById(id);
		}
		
		//update trainingCenter
		@PutMapping("/updatetrainingCenter/{id}")
		@ResponseBody
		private TrainingCenter updatetrainingCenter(@PathVariable("id") int id, @RequestBody TrainingCenter trainingCenter) {
			return trainingCenterService.update(id, trainingCenter);
			
		}
}
