package com.deff.univ.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deff.univ.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
