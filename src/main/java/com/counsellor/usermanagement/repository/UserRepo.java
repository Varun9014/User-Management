package com.counsellor.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.counsellor.usermanagement.Entity.User;


@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	
	
	
	public User findByEmailAndPwd(String email,String pwd);
	
	
}
