package com.deff.univ.services.interfaces;

import com.deff.univ.models.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {
    public Role save(Role role);
    public List<Role> findAll();
    public  Role update(int id,Role role);
    public Optional<Role> findById(int id);
    public String deleteById(int id);

}
