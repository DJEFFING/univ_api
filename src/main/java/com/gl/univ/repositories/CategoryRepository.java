package com.gl.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gl.univ.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
