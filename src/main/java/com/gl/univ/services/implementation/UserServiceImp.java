package com.gl.univ.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.gl.univ.repositories.UserRepository;
import com.gl.univ.services.interfaces.UserService;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class UserServiceImp implements UserService{

	@Override
	public User save(User use) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<com.gl.univ.models.User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public com.gl.univ.models.User update(int id, com.gl.univ.models.User use) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<com.gl.univ.models.User> findById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	
}