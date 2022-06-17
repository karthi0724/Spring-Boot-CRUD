package com.example.crud.userController;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.entity.UserEntity;
import com.example.crud.userServiceImpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
@Autowired
	private UserServiceImpl service;
	
@PostMapping("/saveUser")
public UserEntity saveUser(@RequestBody UserEntity request) {
	UserEntity user =new UserEntity();
   user.setDate(new Date());
   request.setDate(new Date());
	return service.userSaveProcess(request);
}
	
}
