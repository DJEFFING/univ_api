package com.gl.univ.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.gl.univ.models.TrainingCenter;

import com.gl.univ.services.interfaces.TrainingCenterService;

@Controller
@RequestMapping("TrainingCenter/")
public class TrainingCenterController {
	@Autowired
	private TrainingCenterService trainingCenterService;


	@PostMapping("/")
	public @ResponseBody TrainingCenter create(@RequestBody TrainingCenter trainingCenter) {
		return trainingCenterService.save(trainingCenter);
	}


	@GetMapping("/")
	public @ResponseBody List<TrainingCenter> getAll() {
		return trainingCenterService.findAll();

	}

	@PutMapping("/update-{id}")
	public @ResponseBody TrainingCenter update(@RequestBody TrainingCenter trainingCenter, @PathVariable("id") final Integer id) {
		return trainingCenterService.update(id, trainingCenter);
	}

	@GetMapping("/find-{id}")
	public @ResponseBody Optional<TrainingCenter> findById(@PathVariable("id") final Integer id) {
		return trainingCenterService.findById(id);
	}


	@DeleteMapping("/delete-{id}")
	public @ResponseBody String delete(@PathVariable("id") final Integer id) {
		return trainingCenterService.deleteById(id);


	}

}
