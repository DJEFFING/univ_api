package com.gl.univ.services.interfaces;

import java.util.List;
import java.util.Optional;


import com.gl.univ.models.UniversityTestimony;

public interface UniversityTestimonyService {
	public UniversityTestimony save(UniversityTestimony  universityTestimony);
	public List<UniversityTestimony> findAll ();
	public Optional<UniversityTestimony> findById(int id);
	public String deleteById(int id);
	public UniversityTestimony update(int id, UniversityTestimony universityTestimony);

}
