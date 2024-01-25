package com.gl.univ.services.implementation;

import com.gl.univ.controllers.RoleUserController;
import com.gl.univ.models.Role;
import com.gl.univ.models.RoleUser;
import com.gl.univ.repositories.RoleUserRepository;
import com.gl.univ.services.interfaces.RoleUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoleUserServiceImp implements RoleUserService {

    @Autowired
    RoleUserRepository roleUserRepository;
    @Override
    public RoleUser save(RoleUser roleUser) {
        return roleUserRepository.save(roleUser);
    }

    @Override
    public List<RoleUser> findAll() {
        return roleUserRepository.findAll();
    }

    @Override
    public RoleUser update(int id, RoleUser roleUser) {
        Optional<RoleUser> roleUserOptional = findById(id);

        if(roleUserOptional.isPresent()){
            RoleUser newRoleUser = roleUserOptional.get();
            if(roleUser.getRole()!=null){
                newRoleUser.setRole(roleUser.getRole());
            }

            if(roleUser.getUser()!=null){
                newRoleUser.setUser(roleUser.getUser());
            }
            this.save(newRoleUser);
        }
        return null;
    }

    @Override
    public Optional<RoleUser> findById(int id) {
        return roleUserRepository.findById(id);
    }

    @Override
    public String deleteById(int id) {
        roleUserRepository.deleteById(id);
        return "this roleUser has successful delete";
    }
}
