package com.gl.univ.controllers;

import com.gl.univ.models.Speciality;
import com.gl.univ.services.interfaces.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Controller
@RequestMapping("specialities/")
public class SpecialityController {
    @Autowired
    SpecialityService specialityService;
    @PostMapping("/")
    public Speciality save(@RequestBody Speciality speciality){
        return specialityService.save(speciality);
    }
    @GetMapping("/")
    public List<Speciality> findAll(){
        return specialityService.findAll();
    }
    @PutMapping("/update-{id}")
    public  Speciality update(@PathVariable("id") int id,@RequestBody Speciality speciality){
        return specialityService.update(id,speciality);
    }
    @GetMapping("/find-{id}")
    public Optional<Speciality> findById(@PathVariable("id") int id){
        return specialityService.findById(id);
    }
    @DeleteMapping("/delete-{id}")
    public String deleteById(@PathVariable("id") int id){
        specialityService.deleteById(id);
        return "this speciality has successful delete";
    }

    @GetMapping("/findByTrCenter-{idTrCenter}")
    public  List<Speciality> findByIdTrCenter(int idTrCenter){
        return specialityService.findByIdTrCenter(idTrCenter);
    }

}
