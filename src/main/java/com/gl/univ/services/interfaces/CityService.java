package com.gl.univ.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.gl.univ.models.City;

public interface CityService {
	public City save(City city);
	public List<City> findAll();
	public City update(int idCity,City newCity);
	public Optional<City> findById(int idCity);
	public String deleteById(int idCity);

}
