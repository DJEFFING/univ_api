package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.deff.univ.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
