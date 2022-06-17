package com.example.crud.userServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.UserEntity;
import com.example.crud.userDao.UserDAO;
import com.example.crud.userService.UserService;

@Service
public class UserServiceImpl implements UserService{
@Autowired
	private UserDAO dao;
	
	@Override
	public UserEntity userSaveProcess(UserEntity entity) {
		UserEntity user=dao.save(entity);
		return user;
	}

}
