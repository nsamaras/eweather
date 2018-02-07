package com.eweather.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="CITY")
public class City {

	@Id  
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "NAME", nullable = false)
	@NotNull(message = "The name is compulsory")
	@NotEmpty(message = "The name should not be empty")
	private String name;
	
	@Column(name = "VISIBILITY", nullable = false)
	@NotEmpty(message = "The visibility should not be empty")
	private Integer visibility;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="coord_id", unique=true)
	private Coord coord;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="sys_id", unique=true)
	private Sys sys;
	
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
	
}
