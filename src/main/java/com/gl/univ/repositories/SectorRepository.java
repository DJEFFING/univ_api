package com.gl.univ.repositories;

import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gl.univ.models.Sector;

import java.util.List;

@Repository
public interface SectorRepository extends JpaRepository<Sector, Integer> {
    @Query(value = "select sector.* from university,have_sector,sector where university.id=:idUniv and" +
            "university.id=have_sector.university_id and have_sector.sector_id=sector.id",nativeQuery = true)
    public List<Sector> findByInv(@Param("idUniv") int idUniv);

}
