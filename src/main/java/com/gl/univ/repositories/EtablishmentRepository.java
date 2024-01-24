package com.gl.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.univ.models.Etablishment;

@Repository
public interface EtablishmentRepository extends JpaRepository<Etablishment, Integer> {

}
