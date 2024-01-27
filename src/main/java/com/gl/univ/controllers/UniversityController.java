package com.gl.univ.controllers;

import com.gl.univ.models.University;
import com.gl.univ.services.interfaces.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin("http://localhost:4200")
@RequestMapping("/universities")
public class UniversityController {
    @Autowired
    UniversityService universityService;

    @PostMapping
    public @ResponseBody University save(@RequestBody University university){
        return universityService.save(university);
    }

    @GetMapping
    public @ResponseBody List<University> findAll(){
        return universityService.findAll();
    }
    @PutMapping("/update-{id}")
    public  @ResponseBody University update(@PathVariable("id") int id,@RequestBody University university){
        return universityService.update(id,university);
    }
    @GetMapping("/find-{id}")
    public @ResponseBody Optional<University> findById(@PathVariable("id") int id){
        return  universityService.findById(id);
    }

    @DeleteMapping("/delete-{id}")
    public @ResponseBody String delete(int id){
        return universityService.delete(id);
    };

}
