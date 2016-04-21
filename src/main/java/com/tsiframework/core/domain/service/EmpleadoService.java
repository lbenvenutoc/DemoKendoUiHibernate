package com.tsiframework.core.domain.service;

import java.util.List;

import com.tsiframework.core.domain.model.Empleado;


public interface EmpleadoService {

	public List<Empleado> listarTodoEmpleado();
	public int insertarEmpleado(Empleado empleado);
	public int actualizarEmpleado(Empleado empleado);
	public int eliminarEmpleado(Empleado empleado);


}
