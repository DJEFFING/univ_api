package com.deff.univ.services.implementation;

import com.deff.univ.models.Etablishment;
import com.deff.univ.repositories.EtablishmentRepository;
import com.deff.univ.services.interfaces.EtablishmentService;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class EtablishmentServiceImp implements EtablishmentService {

    @Autowired
    EtablishmentRepository etablishmentRepository;

    @Override
    public Etablishment save(Etablishment etablishment) {
        return etablishmentRepository.save(etablishment);
    }

    @Override
    public List<Etablishment> findAll() {
        return etablishmentRepository.findAll();
    }

    @Override
    public Etablishment update(int id, Etablishment etablishment) {
        Optional<Etablishment> optionalEtablishment = this.findById(id);

        if(optionalEtablishment.isPresent()){
        Etablishment newEtablishment = optionalEtablishment.get();

            if(etablishment.getTitle()!=null){
                newEtablishment.setTitle(etablishment.getTitle());
            }
        return this.save(newEtablishment);
        }
        return null;
    }

    @Override
    public Optional<Etablishment> findById(int id) {
        return etablishmentRepository.findById(id);
    }
 
    @Override
    public String deleteById(int id) {
        etablishmentRepository.deleteById(id);
        return "this establishment has delete successful";
    }
}
