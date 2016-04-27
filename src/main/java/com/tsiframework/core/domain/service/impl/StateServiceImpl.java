package com.tsiframework.core.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsiframework.core.domain.model.Country;
import com.tsiframework.core.domain.model.State;
import com.tsiframework.core.domain.service.StateService;
import com.tsiframework.core.infraestructure.repository.StateDao;

@Service("stateService")
public class StateServiceImpl implements StateService {

	@Autowired
	private StateDao dao;

	@Override
	public List<State> listState(Country country) {
		// TODO Auto-generated method stub
		return dao.listState(country);
	}

}
