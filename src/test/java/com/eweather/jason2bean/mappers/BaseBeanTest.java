package com.eweather.jason2bean.mappers;

import com.eweather.info.Clouds;
import com.eweather.info.Coord;

public class BaseBeanTest {

	public com.eweather.info.List generateBean() {
		com.eweather.info.List bean = new com.eweather.info.List();
		
		// clouds
		Clouds clouds = generateClouds();
		bean.setClouds(clouds);
		
		// coord
		Coord coord = new Coord();
		bean.setCoord(coord);
		
		bean.setDt(1);
		bean.setName("Athens");
		bean.setVisibility(1);
		
		return bean;
	}
	
	public Clouds generateClouds() {
		Clouds clouds = new Clouds();
		clouds.setAll(1);
		return clouds;
	}
	
	public Coord generateCoord() {
		Coord coord = new Coord();
		coord.setLat(1.1);
		coord.setLon(1.2);
		return coord;
	}
}
