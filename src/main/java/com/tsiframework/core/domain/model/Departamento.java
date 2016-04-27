package com.tsiframework.core.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Departamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2633755938292237015L;
	private BigDecimal idDepartamento;
	private String codigo;
	private String nombre;

	public BigDecimal getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(BigDecimal idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
