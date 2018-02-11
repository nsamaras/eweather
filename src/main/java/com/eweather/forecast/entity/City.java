package com.eweather.forecast.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CITY")
public class City {

	@Id  
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "MAIN-TEMP", nullable = false)
	private Double main_temp;
	
	@Column(name = "WEATHER_DESCRIPTION", nullable = false)
	private String weatherDescriptio;
	
	@Column(name = "CLOUDS_ALL", nullable = false)
	private Long clouds_all;
	
	@Column(name = "WIND_SPEED", nullable = false)
	private Double wind_speed;
	
	@Column(name = "DT", nullable = false)
	private Long dt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rain_id", unique=true)
	private Rain rain;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getMain_temp() {
		return main_temp;
	}
	public void setMain_temp(Double main_temp) {
		this.main_temp = main_temp;
	}
	public String getWeatherDescriptio() {
		return weatherDescriptio;
	}
	public void setWeatherDescriptio(String weatherDescriptio) {
		this.weatherDescriptio = weatherDescriptio;
	}
	public Long getClouds_all() {
		return clouds_all;
	}
	public void setClouds_all(Long clouds_all) {
		this.clouds_all = clouds_all;
	}
	public Double getWind_speed() {
		return wind_speed;
	}
	public void setWind_speed(Double wind_speed) {
		this.wind_speed = wind_speed;
	}
	public Long getDt() {
		return dt;
	}
	public void setDt(Long dt) {
		this.dt = dt;
	}
	public Rain getRain() {
		return rain;
	}
	public void setRain(Rain rain) {
		this.rain = rain;
	}
	
	
}
