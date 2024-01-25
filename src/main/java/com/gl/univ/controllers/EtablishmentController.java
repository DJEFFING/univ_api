package com.gl.univ.controllers;

import com.gl.univ.models.Etablishment;
import com.gl.univ.services.interfaces.EtablishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("establishment/")
public class EtablishmentController {
    @Autowired
    EtablishmentService etablishmentService;

    @PostMapping("/")
    public Etablishment save(@RequestBody  Etablishment etablishment){
        return etablishmentService.save(etablishment);
    }
    @GetMapping("/")
    public List<Etablishment> findAll(){
        return etablishmentService.findAll();
    }
    @PutMapping("/update-{id}")
    public Etablishment update(@PathVariable("id") int id, @RequestBody Etablishment etablishment){
        return etablishmentService.update(id,etablishment);
    }

    @GetMapping("/find-{id}")
    public Optional<Etablishment> findById(@PathVariable("id") int id){
        return etablishmentService.findById(id);
      }

      @DeleteMapping("/delete-{id}")
    public  String deleteById(@PathVariable("id") int id){
        return etablishmentService.deleteById(id);
      }

}
