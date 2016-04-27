package com.tsiframework.core.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class TablaGeneral implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4137513680617624353L;

	private BigDecimal idTablaGeneral;
	private Integer clase;
	private String codigo;
	private String valor;
	private Integer orden;

	public Integer getClase() {
		return clase;
	}

	public void setClase(Integer clase) {
		this.clase = clase;
	}

	public BigDecimal getIdTablaGeneral() {
		return idTablaGeneral;
	}

	public void setIdTablaGeneral(BigDecimal idTablaGeneral) {
		this.idTablaGeneral = idTablaGeneral;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

}
