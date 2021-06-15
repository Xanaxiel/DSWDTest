package com.dswd.app.service;

import com.dswd.app.http.UserRegistrationDTO;
import com.dswd.app.model.User;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface CustomUserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDTO registration);
}
