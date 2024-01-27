package com.gl.univ.services.interfaces;

import com.gl.univ.models.University;

import java.util.List;
import java.util.Optional;

public interface UniversityService {
    public University save(University university);
    public List<University> findAll();
    public  University update(int id, University university);
    public Optional<University> findById(int id);
    public String delete(int id);
    public List<University> findByIdAdmin(int idAdmin);
    public  List<University> findByIdCategory(int idCategory);
    public List<University> findByIdCity(int idCity);

}
