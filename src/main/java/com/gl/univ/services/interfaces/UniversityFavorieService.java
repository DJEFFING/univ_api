package com.gl.univ.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.gl.univ.models.UniversityFavorie;

public interface UniversityFavorieService {
	 	public UniversityFavorie save(UniversityFavorie universityFavorie);
	    public List<UniversityFavorie> findAll();
	    public  UniversityFavorie update(int id,UniversityFavorie universityFavorie);
	    public Optional<UniversityFavorie> findById(int id);
	    public String deleteById(int id);
	    public String deleteAll();

}
