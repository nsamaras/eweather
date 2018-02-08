package com.eweather.mappers;

import com.eweather.entity.City;
import com.eweather.info.Eweather;

/**
 * That class has the responsibility to map the 
 * @Eweather to @City
 */
public class EweatherToCityMapper {

	public City apply(Eweather eweather) {
		City city = new City();
		
		eweather.getList().forEach(item -> {
			
			city.setName(item.getName());
			
			city.setVisibility(item.getVisibility());
			
			// map the Clouds from json object to Clouds entity
			city.setClouds(new CloudsInfoToCloudsEnityMapper().apply(item.getClouds()));
			
			// map the Coord from json object to Coord entity
			city.setCoord(new CoordInfoToCoordEnityMapper().apply(item.getCoord()));
			
			// map the Main from json object to Main entity 
			city.setMain(new MainInfoToMainEntityMapper().apply(item.getMain()));
			
			// map the Sys from json object to Sys entity 
			city.setSys(new SysInfoToSysEntityMapper().apply(item.getSys()));
			
			// map the Weather from json object to Weather entity 
			city.setWeather(new WeatherListInfoToWeatherListEntityMapper().apply(item.getWeather()));
			
			// map the Wind from json object to Wind entity
			city.setWind(new WindInfoToWindEntityMapper().apply(item.getWind()));
		});

		return city;
	}
}
