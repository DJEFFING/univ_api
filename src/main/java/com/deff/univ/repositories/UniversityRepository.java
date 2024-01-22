package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deff.univ.models.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Integer>{

}
