package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deff.univ.models.Speciality;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Integer>{

}
