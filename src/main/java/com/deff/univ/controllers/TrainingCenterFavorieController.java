package com.deff.univ.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deff.univ.models.TrainingCenterFavorie;
import com.deff.univ.services.interfaces.TrainingCenterFavorieService;

@RestController
public class TrainingCenterFavorieController {
	@Autowired
	private TrainingCenterFavorieService trainingCenterFavorieService;
	
	
	//listing trainingCenterFavorieService
	@GetMapping("/getTrainingCenterFavorie")
	private List<TrainingCenterFavorie> getTrainingcenterfavorite(){
		return trainingCenterFavorieService.findAll();
		
	}
	
	//creation d'un trainingCenterFavorie
	@PostMapping("/addTrainingCenterFavorie")
	private TrainingCenterFavorie createTrainingCenterFavorie(@RequestBody TrainingCenterFavorie trainingCenterFavorie) {
		return trainingCenterFavorieService.save(trainingCenterFavorie);
	}
	//update  d'un trainingCenterFavorie
	@PutMapping("/updateTrainingCenterFavorie/{id}")
	private TrainingCenterFavorie updateTrainingCenterFavorie(@PathVariable int id, @RequestBody TrainingCenterFavorie trainingCenterFavorie ) {
		return trainingCenterFavorieService.update(id, trainingCenterFavorie);
	}
	
	//delete trainingCenterFavorie
	@DeleteMapping("deleteTrainingcenterFavorie/{id}")
	private ResponseEntity<String> deleteTrainingCenterFavorie(@PathVariable int id){
		trainingCenterFavorieService.deleteById(id);
		return ResponseEntity.ok("TrainingCenterFavorie deleted");
	}
	//delete all trainingCenterFavorie
		@DeleteMapping("deleteAllTrainingcenterFavorie/{id}")
		private ResponseEntity<String> deleteAllTrainingCenterFavorie(){
			trainingCenterFavorieService.deleteAll();
			return ResponseEntity.ok("AllTrainingCenterFavorie have deleted");
		}
	
}
