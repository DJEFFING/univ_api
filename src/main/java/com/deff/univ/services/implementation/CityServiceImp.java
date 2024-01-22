package com.deff.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deff.univ.models.City;
import com.deff.univ.repositories.CityRepository;
import com.deff.univ.services.interfaces.CityService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CityServiceImp implements CityService{

	@Autowired
	CityRepository cityRepository;
	@Override
	public City save(City city) {
		return cityRepository.save(city);
	}

	@Override
	public List<City> findAll() {
		return cityRepository.findAll();
	}

	@Override
	public City update(int idCity, City city) {
		Optional<City> cityFind =this.findById(idCity);
		if(cityFind.isPresent()) {
			City newCity = cityFind.get();
			
			if(city.getTitle()!=null) {
				newCity.setTitle(city.getTitle());
			}
			
			return this.save(newCity);
		}
		return null;
	}

	@Override
	public Optional<City> findById(int idCity) {
		// TODO Auto-generated method stub
		return cityRepository.findById(idCity);
	}

	@Override
	public String deleteById(int idCity) {
		cityRepository.deleteById(idCity);
		return "city has successful delete";
	}

}
