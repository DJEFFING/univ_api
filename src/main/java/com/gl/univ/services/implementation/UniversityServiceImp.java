package com.gl.univ.services.implementation;

import com.gl.univ.models.University;
import com.gl.univ.repositories.UniversityRepository;
import com.gl.univ.services.interfaces.UniversityService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UniversityServiceImp implements UniversityService {
    @Autowired
    UniversityRepository universityRepository;

    @Override
    public University save(University university) {
        return universityRepository.save(university);
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public University update(int id, University university) {
        Optional<University> universityOptional = findById(id);
        if(universityOptional.isPresent()){
            University newUniversity = universityOptional.get();

            if(university.getName()!=null){
                newUniversity.setName(university.getName());
            }
            if(university.getLogo()!=null){
                newUniversity.setLogo(university.getLogo());
            }

            if(university.getDescription()!=null){
                newUniversity.setDescription(university.getDescription());
            }

            if(university.getMangerNumber()!=null){
                newUniversity.setMangerNumber(university.getMangerNumber());
            }

            if(university.getWebSite()!=null){
                newUniversity.setWebSite(university.getWebSite());
            }

            if (university.getEtablishment()!=null){
                newUniversity.setEtablishment(university.getEtablishment());
            }

            if(university.getCity()!=null){
                newUniversity.setCity(university.getCity());
            }

            save(newUniversity);
        }

        return null;
    }

    @Override
    public Optional<University> findById(int id) {
        return universityRepository.findById(id);
    }

    @Override
    public String delete(int id) {
        universityRepository.deleteById(id);
        return "this university has successful delete";
    }

    @Override
    public List<University> findByIdAdmin(int idAdmin) {
        return null;
    }

    @Override
    public List<University> findByIdCategory(int idCategory) {
        return null;
    }

    @Override
    public List<University> findByIdCity(int idCity) {
        return null;
    }
}
