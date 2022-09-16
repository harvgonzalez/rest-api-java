package com.restfulws.springmvvjpa.restfulappspring.service;

import com.restfulws.springmvvjpa.restfulappspring.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService { // I need to extend UserDetailsService for the security
    UserDto createUser(UserDto user);

    UserDto getUser(String email);

    UserDto getUserByUserId(String userId);
}
