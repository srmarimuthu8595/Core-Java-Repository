package com.srm.spring.service;

import java.util.List;
import com.srm.spring.doa.CountryDAO;
import com.srm.spring.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("countryService")
public class CountryService {

	@Autowired
	CountryDAO countryDao;
	
	@Transactional
	public List<Country> getAllCountries() {
		return countryDao.getAllCountries();
	}

	@Transactional
	public Country getCountry(int id) {
		return countryDao.getCountry(id);
	}

	@Transactional
	public void addCountry(Country country) {
		countryDao.addCountry(country);
	}

	@Transactional
	public void updateCountry(Country country) {
		countryDao.updateCountry(country);

	}

	@Transactional
	public void deleteCountry(int id) {
		countryDao.deleteCountry(id);
	}
}