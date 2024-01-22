package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deff.univ.models.HaveSector;

@Repository
public interface HaveSectorRepository extends JpaRepository<HaveSector, Integer>{

}
