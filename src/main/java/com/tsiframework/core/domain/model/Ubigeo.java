package com.tsiframework.core.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Ubigeo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -269879655695783626L;

	private BigDecimal idUbigeo;
	private Provincia provincia = new Provincia();
	private String codigo;
	private String nombre;

	public BigDecimal getIdUbigeo() {
		return idUbigeo;
	}

	public void setIdUbigeo(BigDecimal idUbigeo) {
		this.idUbigeo = idUbigeo;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
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
