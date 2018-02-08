package com.eweather.mappers;

import java.util.ArrayList;
import java.util.List;

import com.eweather.entity.Weather;
import com.eweather.info.WeatherInfo;

/**
 * That class has the responsibility to map the 
 * @WeatherInfo to @Weather
 */
public class WeatherListInfoToWeatherListEntityMapper {

	public List<Weather> apply(List<WeatherInfo> weatherList) {
		List<Weather> weathers = new ArrayList<>();
		weatherList.forEach(w -> {
			Weather weather = new Weather();
			weather.setDescription(w.getDescription());
			weather.setIcon(w.getIcon());
			weather.setMain(w.getMain());
			weathers.add(weather);
		});
		return weathers;
	}
}
