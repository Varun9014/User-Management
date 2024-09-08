package com.counsellor.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.counsellor.usermanagement.Entity.User;
import com.counsellor.usermanagement.repository.CityRepo;
import com.counsellor.usermanagement.repository.CountryRepo;
import com.counsellor.usermanagement.repository.StateRepo;
import com.counsellor.usermanagement.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userrepo;

	@Autowired
	private CountryRepo countryrepo;

	@Autowired
	private StateRepo staterepo;

	@Autowired
	private CityRepo cityrepo;

	public boolean registration(User user) {

		User usersaved = userrepo.save(user);
		if (null != usersaved.getUserId()) {
			return true;
		}
		return false;
	}

	public User Login(String email, String pwd) {

		User userlogin = userrepo.findByEmailAndPwd(email, pwd);
		return userlogin;

	}
}
