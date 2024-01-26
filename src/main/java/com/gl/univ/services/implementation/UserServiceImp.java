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
	@Autowired
	private UserRepository userRepository;

	@Override
	public com.gl.univ.models.User save(com.gl.univ.models.User use) {
		
		return userRepository.save(use);
	}

	@Override
	public List<com.gl.univ.models.User> findAll() {
	
		return userRepository.findAll();
	}

	@Override
	public com.gl.univ.models.User update(int id, com.gl.univ.models.User use) {
		 Optional<com.gl.univ.models.User> optionaluser = findById(id);
		 if(optionaluser.isPresent()) {
			 com.gl.univ.models.User newuser = optionaluser.get();
			 if(use.getEmail()!=null) {
				 newuser.setEmail(use.getEmail());
			 }
			 if(use.getFistName()!=null) {
				 newuser.setFistName(use.getFistName());
			 }
			 if(use.getLastName()!=null) {
				 newuser.setLastName(use.getLastName());
			 }
			 if(use.getPassword()!=null) {
				 newuser.setPassword(use.getPassword());
			 }
			 if(use.getProfilImage()!=null) {
				 newuser.setLastName(use.getLastName());
			 }
			 this.save(newuser);
		 }
	
		return null;
	}

	@Override
	public Optional<com.gl.univ.models.User> findById(int id) {

		return userRepository.findById(id);
	}

	@Override
	public String deleteById(int id) {
		userRepository.deleteById(id);
		return "User has deleted";
	}}