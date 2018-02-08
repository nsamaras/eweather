package com.eweather.dao;

import com.eweather.entity.City;

public interface CityDao {

	void persist(City cityEntity);
	
	City findCityById(int id);
}
