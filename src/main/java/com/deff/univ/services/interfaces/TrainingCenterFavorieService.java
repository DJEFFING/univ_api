package com.deff.univ.services.interfaces;

import com.deff.univ.models.TrainingCenterFavorie;

import java.util.List;
import java.util.Optional;

public interface TrainingCenterFavorieService {
    public TrainingCenterFavorie save(TrainingCenterFavorie trainingCenterFavorie);
    public List<TrainingCenterFavorie> findAll();
    public  TrainingCenterFavorie update(int id,TrainingCenterFavorie trainingCenterFavorie);
    public Optional<TrainingCenterFavorie> findById(int id);
    public String deleteById(int id);
    public String deleteAll();

}
