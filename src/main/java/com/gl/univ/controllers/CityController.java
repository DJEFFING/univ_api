package com.gl.univ.controllers;

import com.gl.univ.models.City;
import com.gl.univ.services.interfaces.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("cities/")
public class CityController {

    @Autowired
    CityService cityService;
    @PostMapping("/")
    public City save(@RequestBody City city){
        return  cityService.save(city);
    }
    @GetMapping("/")
    public List<City> findAll(){
        return cityService.findAll();
    };
    @PutMapping("/update-{id}")
    public City update(@PathVariable("id") int idCity,@RequestBody City newCity){
        return cityService.update(idCity,newCity);
    }
    @GetMapping("/find-{id}")
    public Optional<City> findById(@PathVariable("id") int idCity){
        return cityService.findById(idCity);
    }
    @DeleteMapping("/delete-{id}")
    public String deleteById(int idCity){
        return cityService.deleteById(idCity);
    }

}
