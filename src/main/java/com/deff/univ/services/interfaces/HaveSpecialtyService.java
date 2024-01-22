package com.deff.univ.services.interfaces;

//import com.deff.univ.models.HaveSector;

import com.deff.univ.models.HaveSpecialty;

import java.util.List;
import java.util.Optional;

public interface HaveSpecialtyService {
    public HaveSpecialty save(HaveSpecialty haveSpecialty);
    public List<HaveSpecialty> getHave();
    public HaveSpecialty update(int id,HaveSpecialty haveSpecialty);
    public Optional<HaveSpecialty> findById(int id);
    public String deleteById(int id);

}
