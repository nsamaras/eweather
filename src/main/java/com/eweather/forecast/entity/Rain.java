package com.eweather.forecast.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="RAIN")
public class Rain {

	@Id  
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@Column(name = "_3H", nullable = false)
	private Double _3h;
	
	@OneToOne(mappedBy="rain")
	private City city;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double get_3h() {
		return _3h;
	}

	public void set_3h(Double _3h) {
		this._3h = _3h;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	
}
