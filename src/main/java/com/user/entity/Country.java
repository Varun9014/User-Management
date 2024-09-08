package com.user.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_tbl")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int countryId;
	
	public String name;
	
	@CreationTimestamp
	public LocalDate createddate;
	
	@UpdateTimestamp
	public LocalDate updateddate;
	


	public int getCountryId() {
		return countryId;
	}



	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getCreateddate() {
		return createddate;
	}



	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}



	public LocalDate getUpdateddate() {
		return updateddate;
	}



	public void setUpdateddate(LocalDate updateddate) {
		this.updateddate = updateddate;
	}

	public Country() {
		
	}
	

}
