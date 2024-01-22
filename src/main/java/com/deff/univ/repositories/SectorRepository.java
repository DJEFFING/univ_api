package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deff.univ.models.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Integer> {

}
