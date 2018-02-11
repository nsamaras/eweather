package com.eweather.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="WIND")
public class Wind {

	@Id  
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;
	
	@Column(name = "SPEED", nullable = false)
	private Double speed;
	
	@Column(name = "DEG", nullable = false)
	private Integer deg;
	
	@Column(name = "GUST", nullable = false)
	private Double gust;
	
	@OneToOne(mappedBy="wind")
	private City city;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getSpeed() {
		return speed;
	}
	public void setSpeed(Double speed) {
		this.speed = speed;
	}
	public Integer getDeg() {
		return deg;
	}
	public void setDeg(Integer deg) {
		this.deg = deg;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Double getGust() {
		return gust;
	}
	public void setGust(Double gust) {
		this.gust = gust;
	}
	
}
