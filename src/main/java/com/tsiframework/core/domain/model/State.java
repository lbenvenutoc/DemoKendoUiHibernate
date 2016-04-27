package com.tsiframework.core.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "STATE")
@XmlRootElement
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stateId;

	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "COUNTRYID", nullable = false)
	private Integer countryId;
	
	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
