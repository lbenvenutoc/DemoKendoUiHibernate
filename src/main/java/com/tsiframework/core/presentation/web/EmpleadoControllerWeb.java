package com.tsiframework.core.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/empleadoWeb")
public class EmpleadoControllerWeb {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String inicializarEmpleado(ModelMap model) {
		return "legajo/BusquedaEmpleadoAutocompletar";
	}

	@RequestMapping(value = "/mostrarAdministracionLicencia", method = RequestMethod.GET)
	public String mostrarAdministracionLicencia(Model model) {
		String vista = "";
		vista = "legajo/AdmLicencias";
		return vista;

	}

	@RequestMapping(value = "/mostraLicencia", method = RequestMethod.GET)
	public String mostraLicencia(Model model) {
		String vista = "";
		vista = "legajo/Licencia";
		return vista;

	}

	@RequestMapping(value = "/muestraEstudiosFormales", method = RequestMethod.GET)
	public String muestraEstudiosFormales(Model model) {
		String vista = "";
		vista = "legajo/EstudiosFormales";
		return vista;

	}

	@RequestMapping(value = "/muestraEstudiosInformales", method = RequestMethod.GET)
	public String mostrarEstudiosInformales(Model model) {
		String vista = "";
		vista = "legajo/EstudiosInformales";
		return vista;

	}

	@RequestMapping(value = "/muestraCompetencias", method = RequestMethod.GET)
	public String mostrarCompetencias(Model model) {
		String vista = "";
		vista = "legajo/Competencias";
		return vista;

	}

	@RequestMapping(value = "/mostrarAltaBaja", method = RequestMethod.GET)
	public String mostrarAltaBaja(Model model) {
		String vista = "";
		vista = "legajo/AltaBaja";
		return vista;

	}

	@RequestMapping(value = "/mostrarSubirArchivo", method = RequestMethod.GET)
	public String mostrarSubirArchivo(Model model) {
		String vista = "";
		vista = "legajo/SubirArchivo";
		return vista;

	}

	@RequestMapping(value = "/mostrarTitulo", method = RequestMethod.GET)
	public String mostrarTitulo(Model model) {
		String vista = "";
		vista = "legajo/Titulo";
		return vista;

	}

	@RequestMapping(value = "/mostrarEmpleosAnteriores", method = RequestMethod.GET)
	public String mostrarEmpleosAnteriores(Model model) {
		String vista = "";
		vista = "legajo/EmpleosAnteriores";
		return vista;

	}

	@RequestMapping(value = "/mostrarFamiliares", method = RequestMethod.GET)
	public String mostrarFamiliares(Model model) {
		String vista = "";
		vista = "legajo/Familiares";
		return vista;

	}

}
