package com.gl.univ.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.gl.univ.models.TrainingCenterTestimony;

public interface TrainingCenterTestimonyService {
	public TrainingCenterTestimony save(TrainingCenterTestimony trainingCenterTestimony);
	public List<TrainingCenterTestimony> findAll ();
	public Optional<TrainingCenterTestimony> findById(int id);
	public String deleteById(int id);
	public TrainingCenterTestimony update(int id, TrainingCenterTestimony trainingCenterTestimony);
	
}
