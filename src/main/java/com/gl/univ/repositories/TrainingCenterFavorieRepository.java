package com.gl.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.univ.models.TrainingCenterFavorie;

@Repository
public interface TrainingCenterFavorieRepository extends JpaRepository<TrainingCenterFavorie, Integer> {

}
