package com.gl.univ.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.gl.univ.models.University;

public interface UniversityService {
	public University save(University university);

    public List<University> findAll();

    public University update(int id, University university);

    public Optional<University> findById(int id);

    public  String deleteById(int id);
}
