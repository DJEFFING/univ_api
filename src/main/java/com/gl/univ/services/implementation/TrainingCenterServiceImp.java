package com.gl.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.univ.models.TrainingCenter;
import com.gl.univ.repositories.TrainingCenterRepository;
import com.gl.univ.services.interfaces.TrainingCenterService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TrainingCenterServiceImp implements TrainingCenterService {
	@Autowired
	private TrainingCenterRepository trainingCenterRepository;
	@Override
	public TrainingCenter save(TrainingCenter trainingCenter) {

		return trainingCenterRepository.save(trainingCenter);
	}

	@Override
	public List<TrainingCenter> findAll() {
	
		return trainingCenterRepository.findAll();
	}

	@Override
	public TrainingCenter update(int id, TrainingCenter trainingCenter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TrainingCenter> findById(int id) {
		
		return trainingCenterRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		trainingCenterRepository.deleteById(id);
		return "training center has deleted" ;
	}

}
