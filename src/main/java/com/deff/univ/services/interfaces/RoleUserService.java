package com.deff.univ.services.interfaces;

import com.deff.univ.models.Role;
import com.deff.univ.models.RoleUser;

import java.util.List;
import java.util.Optional;

public interface RoleUserService {
    public RoleUser save(RoleUser roleUser);
    public List<Role> findAll();
    public RoleUser update(int id,RoleUser roleUser);
    public Optional<RoleUser> findById(int id);
    public String deleteById();

}
