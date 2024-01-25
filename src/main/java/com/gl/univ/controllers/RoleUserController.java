package com.gl.univ.controllers;

import com.gl.univ.models.RoleUser;
import com.gl.univ.services.interfaces.RoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("userRole/")
public class RoleUserController {
    @Autowired
    RoleUserService roleUserService;

    @PostMapping("/")
    public RoleUser save(@RequestBody  RoleUser roleUser){
        return roleUserService.save(roleUser);
    }
    @GetMapping("/")
    public List<RoleUser> findAll(){
        return roleUserService.findAll();
    }
    @PutMapping("/update-{id}")
    public RoleUser update(@PathVariable("id") int id, @RequestBody RoleUser roleUser){
        return roleUserService.update(id,roleUser);
    }
    @GetMapping("/find-{id}")
    public Optional<RoleUser> findById(@PathVariable("id") int id){
        return roleUserService.findById(id);
    }
    @DeleteMapping("delete-{id}")
    public String deleteById( @PathVariable("id") int id){
        return roleUserService.deleteById(id);
    }


}
