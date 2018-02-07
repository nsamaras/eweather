package com.eweather.entity;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.eweather.entity.City;
import com.eweather.entity.Coord;

public class ModelTest  extends BaseEntityManager {

	@Test
	public void saveTest() {		
		City city = createCityEntity();
		em.persist(city);
		
		// test city
		assertNotNull(city.getId());
		
		// test coord
		assertNotNull(city.getCoord().getId());
		
		// test sys
		assertNotNull(city.getSys().getId());
	}
	
	private City createCityEntity() {
		City city = new City();
		city.setName("test");
		city.setVisibility(1);
		city.setCoord(populateCoord());
		city.setSys(populateSys());
		return city;
	}
	
	private Coord populateCoord() {
		Coord coord = new Coord();
		coord.setLat(1.1);
		coord.setLon(1.1);
		return coord;
	}
	
	private Sys populateSys() {
		Sys sys = new Sys();
		sys.setCountry("Athens");
		sys.setCountry("Greece");
		sys.setMessage(0.0029);
		sys.setSunrise(1517981525);
		sys.setSunset(1518019006);
		sys.setType(1);
		return sys;
	}
	
}
