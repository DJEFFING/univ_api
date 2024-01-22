package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.deff.univ.models.TrainingCenterTestimony;

@Repository
public interface TrainingCenterTestimonyRepository extends JpaRepository<TrainingCenterTestimony, Integer>{

}
