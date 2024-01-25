package com.gl.univ.services.implementation;

import com.gl.univ.models.Speciality;
import com.gl.univ.repositories.SpecialityRepository;
import com.gl.univ.services.interfaces.SpecialityService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class SpecialityServiceImp implements SpecialityService {

    @Autowired
    SpecialityRepository specialityRepository;
    @Override
    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public List<Speciality> findAll() {
        return specialityRepository.findAll();
    }

    @Override
    public Speciality update(int id, Speciality speciality) {
        Optional<Speciality> specialityOptional = findById(id);

        if(specialityOptional.isPresent()){
            Speciality newSpeciality = specialityOptional.get();

            if(speciality.getTitle()!=null){
                newSpeciality.setTitle(speciality.getTitle());
            }

            if(speciality.getMembershipCondition()!=null){
                newSpeciality.setMembershipCondition(speciality.getMembershipCondition());
            }

            if(speciality.getDescription()!=null){
                newSpeciality.setDescription(speciality.getDescription());
            }

            if(speciality.getPrice()!=newSpeciality.getPrice()){
                newSpeciality.setPrice(speciality.getPrice());
            }

            if(speciality.getDurationTraining()!=null){
                newSpeciality.setDurationTraining(speciality.getDurationTraining());
            }

            save(newSpeciality);
        }
        return null;
    }

    @Override
    public Optional<Speciality> findById(int id) {
        return specialityRepository.findById(id);
    }

    @Override
    public String deleteById(int id) {
        specialityRepository.deleteById(id);
        return "this speciality has successful delete";
    }

    @Override
    public List<Speciality> findByIdTrCenter(int idTrCenter) {
        return specialityRepository.findByTrCenter(idTrCenter);
    }
}
