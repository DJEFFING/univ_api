package com.gl.univ.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.gl.univ.models.Category;

public interface CategoryService {
	public Category save(Category category);
	public Category update(Category newCategory,int idCategory);
	public List<Category> findAll();
	public Optional<Category> findById(int idCategory);
	public String deleteById(int idCategory);

}
