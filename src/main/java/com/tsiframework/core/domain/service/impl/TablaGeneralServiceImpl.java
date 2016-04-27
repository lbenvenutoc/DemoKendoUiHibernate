package com.tsiframework.core.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsiframework.core.domain.model.TablaGeneral;
import com.tsiframework.core.domain.service.TablaGeneralService;
import com.tsiframework.core.infraestructure.repository.TablaGeneralDao;

@Service("tablaGeneralService")
public class TablaGeneralServiceImpl implements TablaGeneralService {

	@Autowired
	private TablaGeneralDao tablaGeneralDao;

	public TablaGeneral obtenerTablaGeneral(TablaGeneral tablaGeneral) {
		// TODO Auto-generated method stub
		return tablaGeneralDao.obtenerTablaGeneral(tablaGeneral);
	}

	public TablaGeneral obtenerTablaGeneralTipoDocumento(TablaGeneral tablaGeneral) {
		// TODO Auto-generated method stub
		return tablaGeneralDao.obtenerTablaGeneralTipoDocumento(tablaGeneral);
	}

	public List<TablaGeneral> obtenerListadoTablaGeneral(TablaGeneral tablaGeneral) {
		// TODO Auto-generated method stub
		return tablaGeneralDao.obtenerListadoTablaGeneral(tablaGeneral);
	}

	

}
