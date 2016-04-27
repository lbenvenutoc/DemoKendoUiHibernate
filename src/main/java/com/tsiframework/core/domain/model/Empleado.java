package com.tsiframework.core.domain.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

//CLASE EMPLEADO

@XmlRootElement
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5633141466929303556L;
	private Integer idEmpleado;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombre;	
	
	public Integer getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*
	public String toString() {
		return "{idEmpleado:" + idEmpleado + ", apellidoPaterno:" + apellidoPaterno + ", apellidoMaterno:"
				+ apellidoMaterno + ", nombre:" + nombre + "}";
	}
	*/
	
	
	

}
