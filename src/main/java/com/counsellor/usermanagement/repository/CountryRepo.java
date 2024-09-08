package com.counsellor.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.counsellor.usermanagement.Entity.Country;


@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {

	
	
}
