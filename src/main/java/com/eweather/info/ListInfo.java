package com.eweather.info;

public class ListInfo {

	private CoordInfo coord;
	private SysInfo sys;
	private java.util.List<WeatherInfo> weather;
	private MainInfo main;
	private Integer visibility;
	private WindInfo wind;
	private CloudsInfo clouds;
	private Integer dt;
	private Integer id;
	private String name;
	
	public CoordInfo getCoord() {
		return coord;
	}
	public void setCoord(CoordInfo coord) {
		this.coord = coord;
	}
	public SysInfo getSys() {
		return sys;
	}
	public void setSys(SysInfo sys) {
		this.sys = sys;
	}
	public java.util.List<WeatherInfo> getWeather() {
		return weather;
	}
	public void setWeather(java.util.List<WeatherInfo> weather) {
		this.weather = weather;
	}
	public MainInfo getMain() {
		return main;
	}
	public void setMain(MainInfo main) {
		this.main = main;
	}
	public Integer getVisibility() {
		return visibility;
	}
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}
	public WindInfo getWind() {
		return wind;
	}
	public void setWind(WindInfo wind) {
		this.wind = wind;
	}
	public CloudsInfo getClouds() {
		return clouds;
	}
	public void setClouds(CloudsInfo clouds) {
		this.clouds = clouds;
	}
	public Integer getDt() {
		return dt;
	}
	public void setDt(Integer dt) {
		this.dt = dt;
	}
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
	
	
}
