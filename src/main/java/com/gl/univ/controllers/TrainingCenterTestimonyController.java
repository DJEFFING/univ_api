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


import com.gl.univ.models.TrainingCenterTestimony;

import com.gl.univ.services.interfaces.TrainingCenterTestimonyService;

@RestController
@RequestMapping("/TrainingCenterTestimony")
public class TrainingCenterTestimonyController {
	@Autowired
	private TrainingCenterTestimonyService trainingCenterTestimonyService;


	@PostMapping("/create")
	public TrainingCenterTestimony create(@RequestBody TrainingCenterTestimony trainingCenterTestimony) {
		return trainingCenterTestimonyService.save(trainingCenterTestimony);
	}


	@GetMapping("/get")
	public List<TrainingCenterTestimony> getAll() {
		return trainingCenterTestimonyService.findAll();

	}

	@PutMapping("/update-{id}")
	public TrainingCenterTestimony update(@RequestBody TrainingCenterTestimony trainingCenterTestimony, @PathVariable("id") final Integer id) {
		return trainingCenterTestimonyService.update(id, trainingCenterTestimony);
	}

	@GetMapping("/find-{id}")
	public Optional<TrainingCenterTestimony> findById(@PathVariable("id") final Integer id) {
		return trainingCenterTestimonyService.findById(id);
	}


	@DeleteMapping("/delete-{id}")
	public String delete(@PathVariable("id") final Integer id) {
		return trainingCenterTestimonyService.deleteById(id);


	
}}
