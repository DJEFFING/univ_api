package com.deff.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deff.univ.models.Category;
import com.deff.univ.repositories.CategoryRepository;
import com.deff.univ.services.interfaces.CategoryService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategoryServiceImp implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public Category save(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Category update(Category newCategory,int idCategory) {
		Optional<Category> category = this.findById(idCategory);
		if(category.isPresent()) {
			Category letCategory = category.get();
			if(newCategory.getTitle()!= null) {
				letCategory.setTitle(newCategory.getTitle());
			}
			return this.save(letCategory);
		}
		return null;
	}

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> findById(int idCategory) {
		return categoryRepository.findById(idCategory);
	}

	@Override
	public String deleteById(int idCategory) {
		categoryRepository.deleteById(idCategory);
		return "this category has delete successful !!";
	}

}
