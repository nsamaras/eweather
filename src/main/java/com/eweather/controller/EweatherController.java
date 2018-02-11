package com.eweather.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;

import com.eweather.entity.City;
import com.eweather.forecast.info.ForecastInfo;
import com.eweather.forecast.mappers.ForecastToCityMapper;
import com.eweather.service.EweatherServiceImpl;
import com.eweather.utils.TempUtils;
import com.eweather.weather.info.EweatherInfo;
import com.eweather.weather.mappers.EweatherToCityMapper;
import com.fasterxml.jackson.databind.ObjectMapper;


public class EweatherController {

	public void start() throws MalformedURLException, IOException {
		TempUtils util = new TempUtils();
		EweatherServiceImpl service = new EweatherServiceImpl();
		
		for(String cityCode : Arrays.asList("264371", "734077", "8133690", "8133786", "261743")) {
			String jsonForecast = util.getWeatherForCities("http://api.openweathermap.org/data/2.5/forecast", 
					"2c48c02c54482ea955d6414942572809", Arrays.asList(cityCode));
			
			ObjectMapper mapperForecast = new ObjectMapper();
			ForecastInfo forecastInfo = mapperForecast.readValue(jsonForecast, ForecastInfo.class);
			
			new ForecastToCityMapper().apply(forecastInfo); 
			
			System.out.println("test");
			
			//service.save(city);
		}
		
		
		
//		String jsonWeather = util.getWeatherForCities("http://api.openweathermap.org/data/2.5/group", 
//				"2c48c02c54482ea955d6414942572809", Arrays.asList("264371", "734077", "8133690", "8133786", "261743"));
//		
//		ObjectMapper mapperWeather = new ObjectMapper();
//		EweatherInfo weatherInfo = mapperWeather.readValue(jsonWeather, EweatherInfo.class);
//		City city = new EweatherToCityMapper().apply(weatherInfo);
	}
}
