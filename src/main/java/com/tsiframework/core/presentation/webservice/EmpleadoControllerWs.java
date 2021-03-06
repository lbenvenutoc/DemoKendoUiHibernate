package com.tsiframework.core.presentation.webservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tsiframework.core.domain.model.Country;
import com.tsiframework.core.domain.model.State;
import com.tsiframework.core.domain.service.CountryService;
import com.tsiframework.core.domain.service.StateService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoControllerWs {

	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicializarEmpleado(ModelMap model) {
		// return "legajo/BusquedaEmpleado";
		return "legajo/BusquedaEmpleadoAutocompletar";
	}

	@RequestMapping(value = "/listCountry", method = RequestMethod.GET)
	public ResponseEntity<List<Country>> listCountry() {
		List<Country> lstCountry = new ArrayList<Country>();

		lstCountry = (List<Country>) countryService.listCountry();

		if (lstCountry.isEmpty()) {
			return new ResponseEntity<List<Country>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Country>>(lstCountry, HttpStatus.OK);
	}

	@RequestMapping(value = "/listState", method = RequestMethod.POST)
	public ResponseEntity<List<State>> listState(@RequestBody Country country) {
		List<State> lstState = new ArrayList<State>();

		lstState = (List<State>) stateService.listState(country);

		if (lstState.isEmpty()) {
			return new ResponseEntity<List<State>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<State>>(lstState, HttpStatus.OK);
	}

}
