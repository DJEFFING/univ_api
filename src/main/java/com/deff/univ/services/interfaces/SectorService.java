package com.deff.univ.services.interfaces;

import com.deff.univ.models.Sector;

import java.util.List;
import java.util.Optional;

public interface SectorService {
    public Sector save(Sector sector);
    public List<Sector> findAll();
    public Sector update(int id,Sector sector);
    public Optional<Sector> findById(int id);
    public  String deleteById(int id);
    public List<Sector> findByIdUniv(int idUniv);

}
