package com.tsiframework.core.infraestructure.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsiframework.core.domain.model.Country;

@Repository("countryDao")
@Transactional
public class CountryDaoImpl implements CountryDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Country> listCountry() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Country.class);
		return (List<Country>) criteria.list();
	}

}
