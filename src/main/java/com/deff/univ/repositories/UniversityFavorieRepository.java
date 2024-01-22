package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deff.univ.models.UniversityFavorie;

@Repository
public interface UniversityFavorieRepository extends JpaRepository<UniversityFavorie, Integer>{

}
