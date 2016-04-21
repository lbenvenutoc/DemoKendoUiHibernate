package com.tsiframework.core.presentation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/loginWeb")
public class SeguridadControllerWeb {
	
	@RequestMapping(value="/principal", method=RequestMethod.GET)
	public ModelAndView principal(ModelMap model){
		
		System.out.println("ENTRA SEGURIDAD");
		
		//return "Principal"; 
		//return new ModelAndView("legajo/FrmPrueba",model); 
		//return new ModelAndView("legajo/ListarCrudEmpleado",model); 
		return new ModelAndView("legajo/ListarCrudEmpleado3",model); 
	}	

}
