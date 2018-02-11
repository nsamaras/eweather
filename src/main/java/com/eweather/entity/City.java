package com.eweather.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="CITY")
public class City {

	@Id  
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "VISIBILITY", nullable = false)
	private Integer visibility;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="coord_id", unique=true)
	private Coord coord;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="sys_id", unique=true)
	private Sys sys;
	
	@OneToMany(mappedBy="city",  cascade=CascadeType.ALL)
	private List<Weather> weather;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="main_id", unique=true)
	private Main main;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="wind_id", unique=true)
	private Wind wind;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="clouds_id", unique=true)
	private Clouds clouds;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getVisibility() {
		return visibility;
	}
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	
}
