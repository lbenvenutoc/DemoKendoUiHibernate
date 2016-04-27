package com.tsiframework.core.infraestructure.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tsiframework.core.domain.model.TablaGeneral;

public interface TablaGeneralDao {

	public TablaGeneral obtenerTablaGeneral(@Param("tablaGeneral") TablaGeneral tablaGeneral);

	public TablaGeneral obtenerTablaGeneralTipoDocumento(@Param("tablaGeneral") TablaGeneral tablaGeneral);

	public List<TablaGeneral> obtenerListadoTablaGeneral(@Param("tablaGeneral") TablaGeneral tablaGeneral);

}
