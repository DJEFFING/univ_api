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
public class UserServiceImp {}