package com.gl.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.univ.models.Sector;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Integer> {

}
