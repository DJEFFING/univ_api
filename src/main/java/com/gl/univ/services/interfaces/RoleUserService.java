package com.gl.univ.services.interfaces;

import com.gl.univ.models.Role;
import com.gl.univ.models.RoleUser;

import java.util.List;
import java.util.Optional;

public interface RoleUserService {
    public RoleUser save(RoleUser roleUser);
    public List<RoleUser> findAll();
    public RoleUser update(int id,RoleUser roleUser);
    public Optional<RoleUser> findById(int id);
    public String deleteById(int id);

}
