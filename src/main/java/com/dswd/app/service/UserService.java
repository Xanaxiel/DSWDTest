package com.dswd.app.service;

import com.dswd.app.http.UserRegistrationDTO;
import com.dswd.app.model.User;

public interface UserService {

    User findByEmail(String email);

    User save(UserRegistrationDTO registration);
}
