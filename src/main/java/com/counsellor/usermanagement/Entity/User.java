package com.counsellor.usermanagement.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_tbl")
public class User 
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
	
	private  boolean is_password_reset;
	private boolean  is_first_login;
	
	private String name;
	
	@Column(unique=true)
	private String email;
	
	private Long phno;
	private String pwd;
	
	@CreationTimestamp
	private LocalDate createddate;
	
	@UpdateTimestamp
	private LocalDate updateddate;
	
	private String oldpwd;
	
	private String newpwd;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public boolean isIs_password_reset() {
		return is_password_reset;
	}

	public void setIs_password_reset(boolean is_password_reset) {
		this.is_password_reset = is_password_reset;
	}

	public boolean isIs_first_login() {
		return is_first_login;
	}

	public void setIs_first_login(boolean is_first_login) {
		this.is_first_login = is_first_login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public String getOldpwd() {
		return oldpwd;
	}

	public void setOldpwd(String oldpwd) {
		this.oldpwd = oldpwd;
	}

	public String getNewpwd() {
		return newpwd;
	}

	public void setNewpwd(String newpwd) {
		this.newpwd = newpwd;
	}

	
}
