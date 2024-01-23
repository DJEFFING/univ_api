package com.deff.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.deff.univ.models.HaveSpecialty;
import com.deff.univ.repositories.HaveSpecialtyRepository;
import com.deff.univ.services.interfaces.HaveSpecialtyService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class HaveSpecialtyServiceImp implements HaveSpecialtyService {
	@Autowired
	private HaveSpecialtyRepository haveSpecialtyRepository;

	@Override
	public HaveSpecialty save(HaveSpecialty haveSpecialty) {
		
		return haveSpecialtyRepository.save(haveSpecialty);
	}

	@Override
	public List<HaveSpecialty> getHave() {
	
		return haveSpecialtyRepository.findAll() ;
	}

	@Override
	public HaveSpecialty update(int id, HaveSpecialty haveSpecialty) {
		Optional<HaveSpecialty> optionalhavespecialty = findById(id);
		
		if(optionalhavespecialty.isPresent()) {
			HaveSpecialty newhavespecialty = optionalhavespecialty.get();
			if(haveSpecialty.getSpeciality()!=null) {
				newhavespecialty.setSpeciality(haveSpecialty.getSpeciality());
			}
			if(haveSpecialty.getTrCenter()!=null) {
				newhavespecialty.setTrCenter(haveSpecialty.getTrCenter());
			}
			
			return this.save(newhavespecialty);
		}
		
		
		
		return null;
	}

	@Override
	public Optional<HaveSpecialty> findById(int id) {
	
		return haveSpecialtyRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		haveSpecialtyRepository.deleteById(id);
		return "have specialty has deleted";
	}

}
