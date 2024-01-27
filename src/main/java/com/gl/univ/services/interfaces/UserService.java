package com.gl.univ.services.interfaces;

import com.gl.univ.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public User save(User user);
    public List<User> findAll();
    public User update(int id,User user);
    public Optional<User> findById(int id);
    public String delete(int id);

}
