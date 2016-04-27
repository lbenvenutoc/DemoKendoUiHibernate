package com.tsiframework.core.domain.service;

import java.util.List;

import com.tsiframework.core.domain.model.Country;
import com.tsiframework.core.domain.model.State;

public interface StateService {
	
	public List<State> listState(Country country);

}
