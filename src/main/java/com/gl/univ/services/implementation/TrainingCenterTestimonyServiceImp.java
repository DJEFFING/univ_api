package com.gl.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.univ.models.TrainingCenterTestimony;
import com.gl.univ.repositories.TrainingCenterTestimonyRepository;
import com.gl.univ.services.interfaces.TrainingCenterTestimonyService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class TrainingCenterTestimonyServiceImp implements TrainingCenterTestimonyService{
	@Autowired
	private TrainingCenterTestimonyRepository trainingCenterTestimonyRepository;
	@Override
	public TrainingCenterTestimony save(TrainingCenterTestimony trainingCenterTestimony) {
		
		return trainingCenterTestimonyRepository.save(trainingCenterTestimony);
	}

	@Override
	public List<TrainingCenterTestimony> findAll() {
		
		return trainingCenterTestimonyRepository.findAll();
	}

	@Override
	public Optional<TrainingCenterTestimony> findById(int id) {

		return trainingCenterTestimonyRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		trainingCenterTestimonyRepository.deleteById(id);
		return "TrainingCenterTestimony has deleted";
	}

	@Override
	public TrainingCenterTestimony update(int id, TrainingCenterTestimony trainingCenterTestimony) {
		Optional<TrainingCenterTestimony> optionaltrainingcentertestimony = findById(id);
		if(optionaltrainingcentertestimony.isPresent()) {
			TrainingCenterTestimony newtrainingcentertestimony =optionaltrainingcentertestimony.get();
			if(trainingCenterTestimony.getTrCenter()!=null) {
				newtrainingcentertestimony.setTrCenter(trainingCenterTestimony.getTrCenter());
			}
			if(trainingCenterTestimony.getContent()!=null) {
				newtrainingcentertestimony.setContent(trainingCenterTestimony.getContent());
			}
			if(trainingCenterTestimony.getDate()!=null) {
				newtrainingcentertestimony.setDate(trainingCenterTestimony.getDate());
			}
			if(trainingCenterTestimony.getUser()!=null) {
				newtrainingcentertestimony.setUser(trainingCenterTestimony.getUser());
			}
			this.save(newtrainingcentertestimony);
			
		}
		return null;
	}

}
