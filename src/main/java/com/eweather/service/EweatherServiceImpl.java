package com.eweather.service;

import java.util.List;

import com.eweather.entity.City;
import com.eweather.entity.Coord;

public class EweatherServiceImpl extends BaseEntityManager implements EweatherService  {

	@Override
	public String findCitiesByIds(String baseUrl, String apiKey, List<String> cityIds) {
		return null;
	}

	@Override
	public String findCityById(String baseUrl, String apiKey, Integer cityId) {
		return null;
	}

	@Override
	public void save(City city) {
		
	}
	
	public void saveCoord() {
		Coord coord = new Coord();
		coord.setLat(1.1);
		coord.setLon(1.1);
		em.persist(coord);
	}

}
