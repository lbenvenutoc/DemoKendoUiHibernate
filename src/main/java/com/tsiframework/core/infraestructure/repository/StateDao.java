package com.tsiframework.core.infraestructure.repository;

import java.util.List;

import com.tsiframework.core.domain.model.Country;
import com.tsiframework.core.domain.model.State;

public interface StateDao {
	
	public List<State> listState(Country country);

}
