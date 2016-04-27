package com.tsiframework.core.domain.service;

import java.util.List;

import com.tsiframework.core.domain.model.Departamento;
import com.tsiframework.core.domain.model.Provincia;
import com.tsiframework.core.domain.model.Ubigeo;

public interface UbigeoService {
	
	public List<Departamento> listarDepartamento();
	
	public List<Departamento> listarDepartamentoPorNombre(Departamento departamento);
	
	public List<Provincia> listarProvinciaPorDepartamento(Departamento departamento);
	
	public List<Ubigeo> listarUbigeoPorProvincia(Provincia provincia);

}
