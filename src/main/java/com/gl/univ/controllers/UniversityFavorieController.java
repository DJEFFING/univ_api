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

import com.gl.univ.models.UniversityFavorie;
import com.gl.univ.services.interfaces.UniversityFavorieService;

@Controller
@RequestMapping("UniversityFavorie/")

public class UniversityFavorieController {

	@Autowired
	UniversityFavorieService universityFavorieService;
    @PostMapping("/")
    public UniversityFavorie save(@RequestBody  UniversityFavorie universityFavorie){
        return universityFavorieService.save(universityFavorie);
    }
    
    @PutMapping("/update-{id}")
    public UniversityFavorie update(@PathVariable("id") int id,@RequestBody UniversityFavorie universityFavorie){
        return universityFavorieService.update(id,universityFavorie);
    }
    @GetMapping("/find-{id}")
    public Optional<UniversityFavorie> findById(@PathVariable("id") int id){
        return universityFavorieService.findById(id);
    }
    @DeleteMapping("/delete-{id}")
    public  String deleteById(@PathVariable("id") int id){
        return universityFavorieService.deleteById(id);
    }
    @GetMapping("/")
    public List<UniversityFavorie> findAll(){
        return universityFavorieService.findAll();
    }
}
