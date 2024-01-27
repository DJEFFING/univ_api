package com.gl.univ.controllers;

import com.gl.univ.models.Sector;
import com.gl.univ.services.interfaces.SectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin("http://localhost:4200")
@RequestMapping("sector/")
public class SectorController {
    @Autowired
    SectorService sectorService;
    @PostMapping("/")
    public @ResponseBody Sector save(@RequestBody  Sector sector){
        return sectorService.save(sector);
    }
    @GetMapping("/")
    public @ResponseBody List<Sector> findAll(){
        return sectorService.findAll();
    }
    @PutMapping("/update-{id}")
    public @ResponseBody Sector update(@PathVariable("id") int id,@RequestBody Sector sector){
        return sectorService.update(id,sector);
    }
    @GetMapping("/find-{id}")
    public @ResponseBody Optional<Sector> findById(@PathVariable("id") int id){
        return sectorService.findById(id);
    }
    @DeleteMapping("/delete-{id}")
    public  @ResponseBody String deleteById(@PathVariable("id") int id){
        return sectorService.deleteById(id);
    }
    @GetMapping("/univ-{idUniv}")
    public @ResponseBody List<Sector> findByIdUniv(@PathVariable("id") int idUniv){
        return sectorService.findByIdUniv(idUniv);
    }

}
