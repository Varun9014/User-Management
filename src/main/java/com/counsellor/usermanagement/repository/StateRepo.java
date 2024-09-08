package com.counsellor.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.counsellor.usermanagement.Entity.State;



@Repository
public interface StateRepo extends JpaRepository<State, Integer> {

	
	
	
}
