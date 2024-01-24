package com.gl.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.univ.models.RoleUser;

@Repository
public interface RoleUserRepository extends JpaRepository<RoleUser, Integer> {

}
