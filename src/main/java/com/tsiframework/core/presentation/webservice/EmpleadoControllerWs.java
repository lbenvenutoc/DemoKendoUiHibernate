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

import com.tsiframework.core.domain.model.Departamento;
import com.tsiframework.core.domain.model.Empleado;
import com.tsiframework.core.domain.model.Provincia;
import com.tsiframework.core.domain.model.TablaGeneral;
import com.tsiframework.core.domain.service.EmpleadoService;
import com.tsiframework.core.domain.service.TablaGeneralService;
import com.tsiframework.core.domain.service.UbigeoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoControllerWs {

	@Autowired
	private EmpleadoService empleadoService;

	@Autowired
	private TablaGeneralService tablaGeneralService;

	@Autowired
	private UbigeoService ubigeoService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicializarEmpleado(ModelMap model) {
		// return "legajo/BusquedaEmpleado";
		return "legajo/BusquedaEmpleadoAutocompletar";
	}

	@RequestMapping(value = "/listarTodoEmpleado", method = RequestMethod.POST)
	public ResponseEntity<List<Empleado>> listarTodoEmpleado() {
		List<Empleado> lstEmpleado = new ArrayList<Empleado>();

		lstEmpleado = (List<Empleado>) empleadoService.listarTodoEmpleado();

		if (lstEmpleado.isEmpty()) {
			return new ResponseEntity<List<Empleado>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Empleado>>(lstEmpleado, HttpStatus.OK);
	}

	@RequestMapping(value = "/insertarEmpleado", method = RequestMethod.POST)
	public ResponseEntity<Empleado> insertarEmpleado(@RequestBody Empleado empleado) {
		System.out.println("ENTRA A insertarEmpleado");
		empleadoService.insertarEmpleado(empleado);
		return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
	}

	@RequestMapping(value = "/actualizarEmpleado", method = RequestMethod.POST)
	public ResponseEntity<Empleado> actualizarEmpleado(@RequestBody Empleado empleado) {
		System.out.println("ENTRA A actualizarEmpleado");
		empleadoService.actualizarEmpleado(empleado);
		return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
	}

	@RequestMapping(value = "/eliminarEmpleado", method = RequestMethod.POST)
	public ResponseEntity<Empleado> eliminarEmpleado(@RequestBody Empleado empleado) {
		System.out.println("ENTRA A eliminarEmpleado");
		empleadoService.eliminarEmpleado(empleado);
		return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
	}

	@RequestMapping(value = "/listarTablaMaestra", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<List<TablaGeneral>> listarTablaMaestra(@RequestBody TablaGeneral tablaGeneral) {
		List<TablaGeneral> lstTablaGeneral = new ArrayList<TablaGeneral>();
		System.out.println("obtenerListadoTablaGeneral " + tablaGeneral.getClase());
		lstTablaGeneral = tablaGeneralService.obtenerListadoTablaGeneral(tablaGeneral);
		if (lstTablaGeneral.isEmpty()) {
			return new ResponseEntity<List<TablaGeneral>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<TablaGeneral>>(lstTablaGeneral, HttpStatus.OK);
	}

	@RequestMapping(value = "/listarDepartamentoPorNombre", method = RequestMethod.POST)
	public ResponseEntity<List<Departamento>> listarDepartamentoPorNombre(@RequestBody Departamento departamento) {
		List<Departamento> lstDepartamento = new ArrayList<Departamento>();
		lstDepartamento = (List<Departamento>) ubigeoService.listarDepartamentoPorNombre(departamento);
		if (lstDepartamento.isEmpty()) {
			return new ResponseEntity<List<Departamento>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Departamento>>(lstDepartamento, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listarDepartamento", method = RequestMethod.GET)
	public ResponseEntity<List<Departamento>> listarDepartamento() {
		List<Departamento> lstDepartamento = new ArrayList<Departamento>();
		lstDepartamento = (List<Departamento>) ubigeoService.listarDepartamento();
		if (lstDepartamento.isEmpty()) {
			return new ResponseEntity<List<Departamento>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Departamento>>(lstDepartamento, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/cargarProvincia", method = RequestMethod.POST)
	public ResponseEntity<List<Provincia>> cargarProvincia(@RequestBody Departamento departamento) {
		List<Provincia> lstProvincia = new ArrayList<Provincia>();
		lstProvincia = (List<Provincia>) ubigeoService.listarProvinciaPorDepartamento(departamento);
		if (lstProvincia.isEmpty()) {
			return new ResponseEntity<List<Provincia>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Provincia>>(lstProvincia, HttpStatus.OK);
	}

}
