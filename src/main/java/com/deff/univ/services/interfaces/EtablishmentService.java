package com.deff.univ.services.interfaces;

import com.deff.univ.models.Etablishment;

import java.util.List;
import java.util.Optional;

public interface EtablishmentService {
    public Etablishment save(Etablishment etablishment);
    public List<Etablishment> findAll();
    public Etablishment update(int id,Etablishment etablishment);
    public Optional<Etablishment> findById(int id);
    public  String deleteById(int id);
}
