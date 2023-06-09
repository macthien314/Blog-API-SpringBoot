package com.mt.blog.services;


import java.util.List;

import com.mt.blog.payloads.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto userDto);
	
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userld);
	UserDto getUserById(Integer userld);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userld); 
}
