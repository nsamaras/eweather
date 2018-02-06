package com.eweather.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="COORD")
public class CoordEntity {

	@Column(name = "LON",  nullable = false)
	@NotNull(message = "The lon is compulsory")
	private Double lon;
	
	@Column(name = "LAT",  nullable = false)
	@NotNull(message = "The lat is compulsory")
	private Double lat;
	
	@OneToOne(mappedBy="city")
	@JoinColumn(name="city_id", unique=true)
	private CityEntity city;
	
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public CityEntity getCity() {
		return city;
	}
	public void setCity(CityEntity city) {
		this.city = city;
	}
	
}
