package com.gl.univ.repositories;

import com.gl.univ.models.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gl.univ.models.Speciality;

import java.util.List;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality, Integer>{
    @Query(value = "select speciality.* from speciality,Have_specialty,training_center where training_center.id=:idTrCenter and" +
            "training_center.id=Have_specialty.training_center_id and Have_specialty.speciality_id=speciality.id",nativeQuery = true)
    public List<Speciality> findByTrCenter(@Param("idTrCenter") int idTrCenter);

}
