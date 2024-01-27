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
    public @ResponseBody RoleUser save(@RequestBody  RoleUser roleUser){
        return roleUserService.save(roleUser);
    }
    @GetMapping("/")
    public @ResponseBody List<RoleUser> findAll(){
        return roleUserService.findAll();
    }
    @PutMapping("/update-{id}")
    public @ResponseBody RoleUser update(@PathVariable("id") int id, @RequestBody RoleUser roleUser){
        return roleUserService.update(id,roleUser);
    }
    @GetMapping("/find-{id}")
    public @ResponseBody Optional<RoleUser> findById(@PathVariable("id") int id){
        return roleUserService.findById(id);
    }
    @DeleteMapping("delete-{id}")
    public @ResponseBody String deleteById( @PathVariable("id") int id){
        return roleUserService.deleteById(id);
    }


}
