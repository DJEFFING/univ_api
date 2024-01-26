package com.gl.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.univ.models.UniversityTestimony;

import com.gl.univ.repositories.UniversityTestimonyRepository;
import com.gl.univ.services.interfaces.UniversityTestimonyService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class UniversityTestimonyServiceImp implements UniversityTestimonyService{
	@Autowired
	private UniversityTestimonyRepository universityTestimonyRepository;
	@Override
	public UniversityTestimony save(UniversityTestimony universityTestimony) {
		return universityTestimonyRepository.save(universityTestimony);
	}

	@Override
	public List<UniversityTestimony> findAll() {
		return universityTestimonyRepository.findAll();
	}

	@Override
	public Optional<UniversityTestimony> findById(int id) {
		return universityTestimonyRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		universityTestimonyRepository.deleteById(id);
		return "UniversityTestimony has deleted";
	}

	@Override
	public UniversityTestimony update(int id, UniversityTestimony universityTestimony) {
		Optional<UniversityTestimony> optionaluniversitytestimony = findById(id);
		if(optionaluniversitytestimony.isPresent()) {
			UniversityTestimony newuniversitetestimony =optionaluniversitytestimony.get();
			if(universityTestimony.getUniversity()!=null) {
				newuniversitetestimony.setUniversity(universityTestimony.getUniversity());
			}
			if(universityTestimony.getContent()!=null) {
				newuniversitetestimony.setContent(universityTestimony.getContent());
			}
			if(universityTestimony.getDate()!=null) {
				newuniversitetestimony.setDate(universityTestimony.getDate());
			}
			if(universityTestimony.getUser()!=null) {
				newuniversitetestimony.setUser(universityTestimony.getUser());
			}
			this.save(newuniversitetestimony);
		}
		return null;
	}
}