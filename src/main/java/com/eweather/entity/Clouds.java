package com.eweather.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLOUDS")
public class Clouds {

	@Id  
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;
	
	@Column(name = "ALL", nullable = false)
	private Integer all;
	
	@OneToOne(mappedBy="clouds")
	private City city;

	public Integer getAll() {
		return all;
	}

	public void setAll(Integer all) {
		this.all = all;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}
