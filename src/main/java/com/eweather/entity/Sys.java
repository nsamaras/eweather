package com.eweather.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="SYS")
public class Sys {

	@Id  
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "TYPE", nullable = false)
	@NotEmpty(message = "The type should not be empty")
	private Integer type;
	
	@Column(name = "MESSAGE", nullable = false)
	@NotEmpty(message = "The type should not be empty")
	private Double message;
	
	@Column(name = "country", nullable = false)
	@NotEmpty(message = "The country should not be empty")
	private String country;
	
	@Column(name = "SUNRISE", nullable = false)
	@NotEmpty(message = "The sunrise should not be empty")
	private Integer sunrise;
	
	@Column(name = "SUNSET", nullable = false)
	@NotEmpty(message = "The sunset should not be empty")
	private Integer sunset;
	
	@OneToOne(mappedBy="sys")
	private City city;
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getMessage() {
		return message;
	}
	public void setMessage(Double message) {
		this.message = message;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getSunrise() {
		return sunrise;
	}
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}
	public Integer getSunset() {
		return sunset;
	}
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
