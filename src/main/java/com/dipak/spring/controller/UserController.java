package com.dipak.spring.controller;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dipak.spring.model.request.UserDetailsRequestModel;
import com.dipak.spring.model.response.UserRest;
import com.dipak.spring.shared.dto.UserDto;
import com.dipak.spring.ws.service.UserService;


@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userService;
	
    @GetMapping
    public String getUser() {
        return "Got the user details";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
    	UserRest returnValue = new UserRest();
    	
    	UserDto userDto = new UserDto();
    	BeanUtils.copyProperties(userDetails, userDto);
    	
    	UserDto createdUser = userService.createUser(userDto);
    	BeanUtils.copyProperties(createdUser, returnValue);
        return null;
    }

    @PutMapping
    public String updateUser() {
        return "User record updated";
    }

    @DeleteMapping
    public String deleteUser() {
        return "User deleted successfully";
    }
}
