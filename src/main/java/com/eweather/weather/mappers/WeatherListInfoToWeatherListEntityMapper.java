package com.eweather.weather.mappers;

import java.util.ArrayList;
import java.util.List;

import com.eweather.common.info.WeatherInfo;
import com.eweather.entity.Weather;

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
