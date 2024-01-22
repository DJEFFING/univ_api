package com.deff.univ.services.interfaces;

import com.deff.univ.models.TrainingCenter;
import org.apache.catalina.LifecycleState;

import java.util.List;
import java.util.Optional;

public interface TrainingCenterService {
    public TrainingCenter save(TrainingCenter trainingCenter);

    public List<TrainingCenter> findAll();

    public TrainingCenter update(int id, TrainingCenter trainingCenter);

    public Optional<TrainingCenter> findById(int id);

    public  String deleteById(int id);

}
