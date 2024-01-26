package com.gl.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.univ.models.UniversityFavorie;
import com.gl.univ.repositories.UniversityFavorieRepository;
import com.gl.univ.services.interfaces.UniversityFavorieService;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class UniversityFavorieServiceImp implements  UniversityFavorieService {
	@Autowired
	private UniversityFavorieRepository universityFavorieRepository;

	@Override
	public UniversityFavorie save(UniversityFavorie universityFavorie) {
		
		return universityFavorieRepository.save(universityFavorie);
	}

	@Override
	public List<UniversityFavorie> findAll() {
		
		return universityFavorieRepository.findAll();
	}

	@Override
	public UniversityFavorie update(int id, UniversityFavorie universityFavorie) {
		Optional<UniversityFavorie> optionalUniversityFavorie = findById(id);
		
		if(optionalUniversityFavorie.isPresent()) {
			UniversityFavorie newUniversityFavorie = optionalUniversityFavorie.get();
			if(UniversityFavorie.getUser()!=null) {
				newUniversityFavorie.setUser(UniversityFavorie.getUser());
			}
			if(UniversityFavorie.getUniversity()!=null) {
				newUniversityFavorie.setUniversity(UniversityFavorie.getUniversity());
			}
			return this.save(newUniversityFavorie);
		}
		return null;
	}

	@Override
	public Optional<UniversityFavorie> findById(int id) {
	
		return universityFavorieRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		universityFavorieRepository.deleteById(id);
		return "UniversityFavorie has deleted ";
	}


	}



