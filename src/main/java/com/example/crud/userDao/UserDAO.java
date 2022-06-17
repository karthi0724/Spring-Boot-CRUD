package com.example.crud.userDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.entity.UserEntity;

@Repository
public interface UserDAO extends JpaRepository<UserEntity, Integer>{

}
