package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deff.univ.models.UniversityTestimony;

@Repository
public interface UniversityTestimonyRepository extends JpaRepository<UniversityTestimony, Integer>{

}
