package com.gl.univ.services.implementation;

import com.gl.univ.models.Sector;
import com.gl.univ.repositories.SectorRepository;
import com.gl.univ.services.interfaces.SectorService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class SectorServiceImp implements SectorService {

    @Autowired
    SectorRepository sectorRepository;
    @Override
    public Sector save(Sector sector) {
        return sectorRepository.save(sector);
    }

    @Override
    public List<Sector> findAll() {
        return sectorRepository.findAll();
    }

    @Override
    public Sector update(int id, Sector sector) {

        Optional<Sector> sectorOptional = findById(id);

        if(sectorOptional.isPresent()){
            Sector newSector = sectorOptional.get();

            if(sector.getTitle()!=null){
                newSector.setTitle(sector.getTitle());
            }

            if(sector.getMenvershipCondition()!=null){
                newSector.setMenvershipCondition(sector.getMenvershipCondition());
            }

            if(sector.getDescription()!=null){
                newSector.setDescription(sector.getDescription());
            }

            if(sector.getPrice()!=newSector.getPrice()){
                newSector.setPrice(sector.getPrice());
            }

            if(sector.getDurationCourse()!=null){
                newSector.setDurationCourse(sector.getDurationCourse());
            }
            return  save(newSector);

        }
        return null;
    }

    @Override
    public Optional<Sector> findById(int id) {
        return sectorRepository.findById(id);
    }

    @Override
    public String deleteById(int id) {

        sectorRepository.deleteById(id);
        return "this sector has delete successful !!";
    }

    @Override
    public List<Sector> findByIdUniv(int idUniv) {
        return sectorRepository.findByInv(idUniv);
    }
}
