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

import com.gl.univ.models.UniversityTestimony;

import com.gl.univ.services.interfaces.UniversityTestimonyService;
@RestController
@RequestMapping("/UniversityTestimony")
public class UniversityTestimonyController {
	@Autowired
	private UniversityTestimonyService universityTestimonyTestimonyService;


	@PostMapping("/create")
	public UniversityTestimony create(@RequestBody UniversityTestimony universityTestimony) {
		return universityTestimonyTestimonyService.save(universityTestimony);
	}


	@GetMapping("/get")
	public List<UniversityTestimony> getAll() {
		return universityTestimonyTestimonyService.findAll();

	}

	@PutMapping("/update-{id}")
	public UniversityTestimony update(@RequestBody UniversityTestimony universityTestimony, @PathVariable("id") final Integer id) {
		return universityTestimonyTestimonyService.update(id, universityTestimony);
	}

	@GetMapping("/find-{id}")
	public Optional<UniversityTestimony> findById(@PathVariable("id") final Integer id) {
		return universityTestimonyTestimonyService.findById(id);
	}


	@DeleteMapping("/delete-{id}")
	public String delete(@PathVariable("id") final Integer id) {
		return universityTestimonyTestimonyService.deleteById(id);


	
}

}
