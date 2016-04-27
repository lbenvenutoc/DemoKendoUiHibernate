package com.tsiframework.core.infraestructure.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tsiframework.core.domain.model.Departamento;
import com.tsiframework.core.domain.model.Provincia;
import com.tsiframework.core.domain.model.Ubigeo;

public interface UbigeoDao {
	
	public List<Departamento> listarDepartamento();
	
	public List<Departamento> listarDepartamentoPorNombre(@Param("departamento") Departamento departamento);

	public List<Provincia> listarProvinciaPorDepartamento(@Param("departamento") Departamento departamento);

	public List<Ubigeo> listarUbigeoPorProvincia(@Param("provincia") Provincia provincia);

}
