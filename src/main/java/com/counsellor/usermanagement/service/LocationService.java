package com.counsellor.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.counsellor.usermanagement.repository.CityRepo;
import com.counsellor.usermanagement.repository.CountryRepo;
import com.counsellor.usermanagement.repository.StateRepo;

@Service
public class LocationService {

	@Autowired
	private CountryRepo countryrepo;

	@Autowired
	private StateRepo staterepo;

	@Autowired
	private CityRepo cityrepo;

	private String Country;
	private String State;
	private String City;

	public CountryRepo getCountryrepo() {
		return countryrepo;
	}

	public void setCountryrepo(CountryRepo countryrepo) {
		this.countryrepo = countryrepo;
	}

	public StateRepo getStaterepo() {
		return staterepo;
	}

	public void setStaterepo(StateRepo staterepo) {
		this.staterepo = staterepo;
	}

	public CityRepo getCityrepo() {
		return cityrepo;
	}

	public void setCityrepo(CityRepo cityrepo) {
		this.cityrepo = cityrepo;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
}
