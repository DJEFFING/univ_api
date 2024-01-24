package com.gl.univ.controllers;

import java.util.List;
import java.util.Optional;

import com.gl.univ.models.HaveSpecialty;
import com.gl.univ.services.interfaces.HaveSpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("haveSpecialty/")
public class HaveSpecialtyController {
	@Autowired
	private HaveSpecialtyService haveSpecialtyService;
	
	//creation haveSpecialty
	@PostMapping("/")
	private HaveSpecialty create(@RequestBody HaveSpecialty haveSpecialty) {
		
		return haveSpecialtyService.save(haveSpecialty);
		
	}
	
	//listing  haveSpecialty
	@GetMapping("/")
	private List<HaveSpecialty> getAll(){
		return haveSpecialtyService.getHave(); 	
	}
	
	//suppression d'une haveSpecialty
	@DeleteMapping("/delete-{id}")
	private String delete(@PathVariable("id") int id){
		return  haveSpecialtyService.deleteById(id);
	}
	
	//listing haveSpecialty par id
	@GetMapping("/find-{id}")
	private Optional<HaveSpecialty> getHaveSpecialtyById(@PathVariable("id") int id) {
		return haveSpecialtyService.findById(id);
	}
	
	//update haveSpecialty
	@PutMapping("/update-{id}")
	private HaveSpecialty update(@PathVariable("id") int id, @RequestBody HaveSpecialty haveSpecialty) {
		return haveSpecialtyService.update(id, haveSpecialty);
	}
}
