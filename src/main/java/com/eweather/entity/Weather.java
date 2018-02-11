package com.eweather.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="WEATHER")
public class Weather {

	@Id  
	@Column(name = "id", updatable = false, nullable = false)
	private Integer id;
	
	@Column(name = "main", nullable = false)
	private String main;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "icon", nullable = false)
	private String icon;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
}
