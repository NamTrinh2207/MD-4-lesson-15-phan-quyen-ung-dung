package com.example.jwtusingdatabase.service.user;

import com.example.jwtusingdatabase.model.User;
import com.example.jwtusingdatabase.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}