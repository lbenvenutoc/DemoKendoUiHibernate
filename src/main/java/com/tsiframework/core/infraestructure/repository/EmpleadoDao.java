package com.tsiframework.core.infraestructure.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tsiframework.core.domain.model.Empleado;


public interface EmpleadoDao {

	public List<Empleado> listarTodoEmpleado();
	public int insertarEmpleado(@Param("empleado") Empleado empleado);
	public int actualizarEmpleado(@Param("empleado") Empleado empleado);
	public int eliminarEmpleado(@Param("empleado") Empleado empleado);

}
