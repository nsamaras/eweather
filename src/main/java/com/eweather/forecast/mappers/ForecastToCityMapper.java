package com.eweather.forecast.mappers;

import com.eweather.forecast.entity.City;
import com.eweather.forecast.info.ForecastInfo;

public class ForecastToCityMapper {

	public City apply(ForecastInfo forecastInfo) {
		City city = new City();
		return city;
	}
}
