package com.gl.univ.services.implementation;

import java.util.List;

import java.util.Optional;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.univ.models.HaveSector;
import com.gl.univ.repositories.HaveSectorRepository;
import com.gl.univ.services.interfaces.HaveSectorService;

@Service
@Transactional
public class HaveSectorServiceImp implements HaveSectorService {

	@Autowired 
	private HaveSectorRepository haveSectorRepository;

	@Override
	public HaveSector save(HaveSector haveSector) {
		
		return haveSectorRepository.save(haveSector);
	}

	@Override
	public List<HaveSector> getHave() {

		return haveSectorRepository.findAll();
	}

	@Override
	public HaveSector update(int id, HaveSector haveSector) {
		Optional<HaveSector> optionalhaveSector = this.findById(id);
		if(optionalhaveSector.isPresent()) {
			HaveSector newhavesector = optionalhaveSector.get();
			if(haveSector.getSector()!=null) {
				newhavesector.setSector(haveSector.getSector());
			}
			if(haveSector.getUniversity()!=null) {
				newhavesector.setUniversity(haveSector.getUniversity());
			}
           return this.save(haveSector);
		}
		return null;
	}

	@Override
	public Optional<HaveSector> findById(int id) {
	
		return haveSectorRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		haveSectorRepository.deleteById(id);
		return "HaveSector has successfull deleted";
	}
}
