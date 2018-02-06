package com.eweather.dao;

import com.eweather.entity.CityEntity;

public interface CityDao {

	void create(CityEntity cityEntity);
	
	CityEntity find(int id);
}
