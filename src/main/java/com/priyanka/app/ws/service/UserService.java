package com.priyanka.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.priyanka.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {

	UserDto createUser(UserDto user);
}
