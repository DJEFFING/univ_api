package com.deff.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deff.univ.models.TrainingCenter;
import com.deff.univ.repositories.TrainingCenterRepository;
import com.deff.univ.services.interfaces.TrainingCenterService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class TrainingCenterServiceImp implements TrainingCenterService{
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
		Optional<TrainingCenter> optionaltrainingcenter = findById(id);
		if(optionaltrainingcenter.isPresent()) {
			TrainingCenter newtrainingcenter = optionaltrainingcenter.get();
			if(trainingCenter.getWebSite()!=null) {
				newtrainingcenter.setWebSite(trainingCenter.getWebSite());
			}
			if(trainingCenter.getCategory()!=null) {
				newtrainingcenter.setCategory(trainingCenter.getCategory());
			}
			if(trainingCenter.getCity()!=null) {
				newtrainingcenter.setCity(trainingCenter.getCity());
			}
			if(trainingCenter.getDescription()!=null) {
				newtrainingcenter.setDescription(trainingCenter.getDescription());
			}
			if(trainingCenter.getEtablishment()!=null) {
				newtrainingcenter.setEtablishment(trainingCenter.getEtablishment());
			}
			if(trainingCenter.getLogo()!=null) {
				newtrainingcenter.setLogo(trainingCenter.getLogo());
			}
			if(trainingCenter.getMangerNumber()!=null) {
				newtrainingcenter.setMangerNumber(trainingCenter.getMangerNumber());
			}
			if(trainingCenter.getName()!=null) {
				newtrainingcenter.setName(trainingCenter.getName());
			}
			if(trainingCenter.getUser()!=null) {
				newtrainingcenter.setUser(trainingCenter.getUser());
			}
			return this.save(newtrainingcenter);
		}
		return null;
	}

	@Override
	public Optional<TrainingCenter> findById(int id) {
		
		return trainingCenterRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		trainingCenterRepository.deleteById(id);
		return "training center has deleted";
	}

}
