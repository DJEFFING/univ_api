package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.deff.univ.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
