package com.tsiframework.core.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Provincia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6701763936123163017L;

	private BigDecimal idProvincia;
	private Departamento departamento;
	private String codigo;
	private String nombre;

	public BigDecimal getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(BigDecimal idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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
