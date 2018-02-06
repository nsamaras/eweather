package com.eweather.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;
import org.junit.Test;

import com.eweather.entity.CityEntity;


public class CityServiceTest  {

	
	@Test
	public void createCityTest() {
		CityService service = new CityService();
		CityEntity cityEntity = service.createCityEntity();
		assertNotNull(cityEntity.getId());
	}
	
}
