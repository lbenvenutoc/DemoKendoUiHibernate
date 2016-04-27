package com.tsiframework.core.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsiframework.core.domain.model.Country;
import com.tsiframework.core.domain.service.CountryService;
import com.tsiframework.core.infraestructure.repository.CountryDao;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDao dao;

	@Override
	public List<Country> listCountry() {
		// TODO Auto-generated method stub
		return dao.listCountry();
	}

}
