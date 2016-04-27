package com.tsiframework.core.infraestructure.repository;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tsiframework.core.domain.model.Country;
import com.tsiframework.core.domain.model.State;

@Repository("stateDao")
@Transactional
public class StateDaoImpl implements StateDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<State> listState(Country country) {
		return (List<State>) sessionFactory.getCurrentSession()
				.createQuery("select s from State s where s.countryId = :id").setParameter("id", country.getCountryId())
				.list();
	}

}
