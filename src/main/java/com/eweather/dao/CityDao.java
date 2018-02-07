package com.eweather.dao;

import com.eweather.entity.City;

public interface CityDao {

	void create(City cityEntity);
	
	City find(int id);
}
