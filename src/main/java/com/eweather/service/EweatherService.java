package com.eweather.service;

import java.util.List;

import com.eweather.entity.City;

public interface EweatherService {

	public String findCitiesByIds(String baseUrl, String apiKey, List<String> cityIds);
	
	public String findCityById(String baseUrl, String apiKey, Integer cityId);
	
	public void save(City city);
}
