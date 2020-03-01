package com.geekbrains.newsportal.services;

import com.geekbrains.newsportal.entities.User;
import com.geekbrains.newsportal.utils.SystemUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);
    boolean isUserExist(String username);
    User save(SystemUser systemUser);
}
