package com.tsiframework.core.domain.service;

import java.util.List;

import com.tsiframework.core.domain.model.TablaGeneral;

public interface TablaGeneralService {
	
	public TablaGeneral obtenerTablaGeneral(TablaGeneral tablaGeneral);
	public TablaGeneral obtenerTablaGeneralTipoDocumento(TablaGeneral tablaGeneral);
	public List<TablaGeneral> obtenerListadoTablaGeneral(TablaGeneral tablaGeneral);
	

}
