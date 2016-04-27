package com.tsiframework.core.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsiframework.core.domain.model.Departamento;
import com.tsiframework.core.domain.model.Provincia;
import com.tsiframework.core.domain.model.Ubigeo;
import com.tsiframework.core.domain.service.UbigeoService;
import com.tsiframework.core.infraestructure.repository.UbigeoDao;

@Service("ubigeoService")
public class UbigeoServiceImpl implements UbigeoService {

	@Autowired
	private UbigeoDao ubigeoDao;

	public List<Departamento> listarDepartamentoPorNombre(Departamento departamento) {
		// TODO Auto-generated method stub
		return ubigeoDao.listarDepartamentoPorNombre(departamento);
	}

	public List<Provincia> listarProvinciaPorDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return ubigeoDao.listarProvinciaPorDepartamento(departamento);
	}

	public List<Ubigeo> listarUbigeoPorProvincia(Provincia provincia) {
		// TODO Auto-generated method stub
		return ubigeoDao.listarUbigeoPorProvincia(provincia);
	}

	public List<Departamento> listarDepartamento() {
		// TODO Auto-generated method stub
		return ubigeoDao.listarDepartamento();
	}

}
