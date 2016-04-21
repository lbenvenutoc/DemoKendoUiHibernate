package com.tsiframework.core.domain.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tsiframework.core.domain.model.Empleado;
import com.tsiframework.core.domain.service.EmpleadoService;
import com.tsiframework.core.infraestructure.repository.EmpleadoDao;

@Service("empleadoService")
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;

	
	public List<Empleado> listarTodoEmpleado() {
		// TODO Auto-generated method stub
		return empleadoDao.listarTodoEmpleado();
	}

	
	public int actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.actualizarEmpleado(empleado);
	}

	
	public int insertarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.insertarEmpleado(empleado);
	}

	
	public int eliminarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return empleadoDao.eliminarEmpleado(empleado);
	}

}
