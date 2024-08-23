package com.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	public User findByUserName(String user_name);
	public User findByUserNamePsw( String user_name , String psw);

}
