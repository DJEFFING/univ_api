package com.deff.univ.services.interfaces;

import com.deff.univ.models.HaveSector;

import java.util.List;
import java.util.Optional;

public interface HaveSectorService {
public HaveSector save(HaveSector haveSector);
public List<HaveSector> getHave();
public HaveSector update(int id,HaveSector haveSector);
public Optional<HaveSector> findById(int id);
public String deleteById(int id);}
