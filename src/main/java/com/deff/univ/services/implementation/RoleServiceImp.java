package com.deff.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deff.univ.models.Role;
import com.deff.univ.repositories.RoleRepository;
import com.deff.univ.services.interfaces.RoleService;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class RoleServiceImp implements RoleService {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role save(Role role) {
		
		return roleRepository.save(role);
	}

	@Override
	public List<Role> findAll() {
		
		return roleRepository.findAll();
	}

	@Override
	public Role update(int id, Role role) {
		Optional<Role> optionalRole = findById(id);
		
		if(optionalRole.isPresent()) {
			Role newRole = optionalRole.get();
			if(role.getTitle()!=null) {
				newRole.setTitle(role.getTitle());
			}
			return this.save(newRole);
		}
		return null;
	}

	@Override
	public Optional<Role> findById(int id) {
	
		return roleRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		roleRepository.deleteById(id);
		return "Role has deleted";
	}

}
