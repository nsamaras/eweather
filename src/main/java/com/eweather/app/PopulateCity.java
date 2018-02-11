package com.eweather.app;

import java.util.Arrays;
import java.util.List;

import com.eweather.entity.City;
import com.eweather.entity.Clouds;
import com.eweather.entity.Coord;
import com.eweather.entity.Main;
import com.eweather.entity.Sys;
import com.eweather.entity.Weather;
import com.eweather.entity.Wind;

public class PopulateCity {

	public City populateCity() {
		City city = new City();
		city.setName("test");
		city.setVisibility(1);
		city.setCoord(getCoord());
		city.setSys(getSys());
		city.setWeather(getWeather());
		city.setMain(getMain());
		city.setWind(getWind());
		city.setClouds(getClouds()); 
		city.setId(735914);
		return city;
	}
	
	private Coord getCoord() {
		Coord coord = new Coord();
		coord.setLat(1.1);
		coord.setLon(1.1);
		return coord;
	}
	
	private Sys getSys() {
		Sys sys = new Sys();
		sys.setCountry("Athens");
		sys.setCountry("Greece");
		sys.setMessage(0.0029);
		sys.setSunrise(1517981525);
		sys.setSunset(1518019006);
		sys.setType(1);
		sys.setId(5704);
		return sys;
	}
	
	private List<Weather> getWeather() {
		Weather weather_1 = new Weather();
		weather_1.setDescription("description_1");
		weather_1.setIcon("icon_1");
		weather_1.setMain("main_1");
		weather_1.setId(500);
		
		Weather weather_2 = new Weather();
		weather_2.setDescription("description_2");
		weather_2.setIcon("icon_2");
		weather_2.setMain("main_2");
		weather_2.setId(501);
		
		return Arrays.asList(weather_1, weather_2);
	}
	
	private Main getMain() {
		Main main = new Main();
		main.setHumidity(93);
		main.setPressure(1014);
		main.setTemp(9.53);
		main.setTemp_max(11);
		main.setTemp_min(8);
		return main;
	}
	
	private Wind getWind() {
		Wind wind = new Wind();
		wind.setDeg(290);
		wind.setSpeed(2.1);
		wind.setGust(1.1);
		return wind;
	}
	
	private Clouds getClouds() {
		Clouds clouds = new Clouds();
		clouds.setAll(75);
		return clouds;
	}
}
