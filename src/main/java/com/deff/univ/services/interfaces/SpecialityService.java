package com.deff.univ.services.interfaces;

import com.deff.univ.models.Speciality;

import java.util.List;
import java.util.Optional;

public interface SpecialityService {
    public Speciality save(Speciality speciality);
    public List<Speciality> findAll();
    public  Speciality update(int id,Speciality speciality);
    public Optional<Speciality> findById(int id);
    public String deleteById(int id);
    public  List<Speciality> findByIdTrCenter(int idTrCenter);

}
