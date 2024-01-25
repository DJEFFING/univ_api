package com.gl.univ.controllers;

import com.gl.univ.models.Category;
import com.gl.univ.services.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("categories/")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/")
    public Category save(@RequestBody  Category category){
        return  categoryService.save(category);
    }
    @PutMapping("update-{id}")
    public Category update(@RequestBody Category newCategory,@PathVariable("id") int idCategory){
        return  categoryService.update(newCategory,idCategory);
    }
    @GetMapping("/")
    public List<Category> findAll(){
        return categoryService.findAll();
    };
    @GetMapping("find-{id}")
    public Optional<Category> findById(@PathVariable("id") int idCategory){
        return categoryService.findById(idCategory);
    };
    @DeleteMapping("delete-{id}")
    public String deleteById( @PathVariable("id") int idCategory){
        return categoryService.deleteById(idCategory);
    };



}
