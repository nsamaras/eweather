package com.eweather.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MAIN")
public class Main {
	@Id  
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "TEMP", nullable = false)
	private Double temp;
	
	@Column(name = "PRESSURE", nullable = false)
	private Integer pressure;
	
	@Column(name = "HUMIDITY", nullable = false)
	private Integer humidity;
	
	@Column(name = "TEMP_MIN", nullable = false)
	private Integer temp_min;
	
	@Column(name = "TEMP_MAX", nullable = false)
	private Integer temp_max;
	
	@OneToOne(mappedBy="main")
	private City city;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getTemp() {
		return temp;
	}
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	public Integer getPressure() {
		return pressure;
	}
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	public Integer getHumidity() {
		return humidity;
	}
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public Integer getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(Integer temp_min) {
		this.temp_min = temp_min;
	}
	public Integer getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(Integer temp_max) {
		this.temp_max = temp_max;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
}
