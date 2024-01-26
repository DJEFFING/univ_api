package com.gl.univ.services.interfaces;

import java.util.List;
import java.util.Optional;

import com.gl.univ.models.User;





public interface UserService {
	  public User save(User use);
	    public List<User> findAll();
	    public  User update(int id,User use);
	    public Optional<User> findById(int id);
	    public String deleteById(int id);

}
