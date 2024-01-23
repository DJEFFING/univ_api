package com.deff.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deff.univ.models.TrainingCenterFavorie;
import com.deff.univ.repositories.TrainingCenterFavorieRepository;
import com.deff.univ.services.interfaces.TrainingCenterFavorieService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class TrainingCenterFavorieServcieImp implements TrainingCenterFavorieService{
	@Autowired
	private TrainingCenterFavorieRepository trainingCenterFavorieRepository;
	@Override
	public TrainingCenterFavorie save(TrainingCenterFavorie trainingCenterFavorie) {
	
		return trainingCenterFavorieRepository.save(trainingCenterFavorie);
	}

	@Override
	public List<TrainingCenterFavorie> findAll() {
		
		return trainingCenterFavorieRepository.findAll();
	}

	@Override
	public TrainingCenterFavorie update(int id, TrainingCenterFavorie trainingCenterFavorie) {
		Optional<TrainingCenterFavorie> optionaltrainingcenterfavorie = this.findById(id);
		if(optionaltrainingcenterfavorie.isPresent()) {
			TrainingCenterFavorie newTrainingcenterfavorie = optionaltrainingcenterfavorie.get();
			if(trainingCenterFavorie.getTrCenter()!=null) {
				newTrainingcenterfavorie.setTrCenter(trainingCenterFavorie.getTrCenter());
			}
			if(trainingCenterFavorie.getUser()!=null) {
				newTrainingcenterfavorie.setUser(trainingCenterFavorie.getUser());
			}
			this.save(newTrainingcenterfavorie);
		}
		return null;
	}

	@Override
	public Optional<TrainingCenterFavorie> findById(int id) {
		
		return trainingCenterFavorieRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		trainingCenterFavorieRepository.deleteById(id);
		return "training center favorie has deleted successful";
	}

	@Override
	public String deleteAll() {
		trainingCenterFavorieRepository.deleteAll();
		return  "training center favorie has deleted successful";
	}

}
