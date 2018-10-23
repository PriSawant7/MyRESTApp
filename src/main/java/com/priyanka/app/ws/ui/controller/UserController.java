package com.priyanka.app.ws.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyanka.app.ws.service.UserService;
import com.priyanka.app.ws.shared.dto.UserDto;
import com.priyanka.app.ws.ui.model.request.UserDetailsRequestModel;
import com.priyanka.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("users") // http://localhost:8080/users/
public class UserController {

	@Autowired
	UserService userService; //user service property
	
	@GetMapping
	public String getUser() {
		return "get user was called";
	}

	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {

		UserRest returnValue = new UserRest(); // obj to return information

		UserDto userDto = new UserDto(); // user data transfer object.
		BeanUtils.copyProperties(userDetails, userDto); // populate the object with details received from the user

		UserDto createUser = userService.createUser(userDto); // call service call and createUser method to create a
																// user with the userDto object
		BeanUtils.copyProperties(createUser, returnValue);
		return returnValue;
		
	}

	@PutMapping
	public String updateUser() {
		
		return "update user was called";
	}

	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}

}
