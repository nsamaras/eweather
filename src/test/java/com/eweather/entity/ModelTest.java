package com.eweather.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ModelTest extends BaseEntityManager {

	@Test
	public void persistTest() {

		City city = new PopulateModel().populateCity();

		em.persist(city);

		// test city
		assertNotNull(city.getId());

		// test coord
		assertNotNull(city.getCoord().getId());

		// test sys
		assertNotNull(city.getSys().getId());

		// weather
		assertEquals(2, city.getWeather().size());
		assertNotNull(city.getWeather().get(0).getId());
		assertNotNull(city.getWeather().get(1).getId());

		// main
		assertNotNull(city.getMain().getId());

		// wind
		assertNotNull(city.getWind().getId());

		// clouds
		assertNotNull(city.getClouds().getId());
	}

	@Test
	public void findByIdTest() {

		City city = new PopulateModel().populateCity();
		em.persist(city);

		City result = em.find(City.class, city.getId());
		
		// test city
		assertEquals(Integer.valueOf(735914), result.getId());
		
		// test coord
		assertNotNull(result.getCoord().getId());
		
		// test sys
		assertEquals(Integer.valueOf(5704), result.getSys().getId());
		
		// weather
		assertEquals(2, result.getWeather().size());
		assertNotNull(result.getWeather().get(0).getId());
		assertNotNull(result.getWeather().get(1).getId());
		
		// main
		assertNotNull(result.getMain().getId());
		
		// wind
		assertNotNull(result.getWind().getId());
		
		// clouds
		assertNotNull(result.getClouds().getId());
	}

}
