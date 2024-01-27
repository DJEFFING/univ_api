package com.gl.univ.services.implementation;

import com.gl.univ.models.User;
import com.gl.univ.repositories.UserRepository;
import com.gl.univ.services.interfaces.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(int id, User user) {
        Optional<User> userOptional= findById(id);

        if(userOptional.isPresent()){
         User newUser = userOptional.get();

         if(user.getEmail()!=null){
             newUser.setEmail(user.getEmail());
         }

         if(user.getFistName()!=null){
             newUser.setFistName(user.getFistName());
         }

         if (user.getLastName()!=null){
             newUser.setLastName(user.getLastName());
         }

         if(user.getPassword()!=null){
             newUser.setPassword(user.getPassword());
         }
         if(user.getProfilImage()!=null){
             newUser.setProfilImage(user.getProfilImage());
         }
         save(newUser);
        }
        return null;
    }

    @Override
    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public String delete(int id) {
        userRepository.deleteById(id);
        return "this user has delete successful";
    }
}
