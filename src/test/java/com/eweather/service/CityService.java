package com.eweather.service;

import javax.persistence.EntityManager;

import com.eweather.bean.Clouds;
import com.eweather.bean.Coord;
import com.eweather.entity.CityEntity;
import com.eweather.entity.CoordEntity;

public class CityService extends BaseEntity {

	protected EntityManager em;
	
	public CityService() {
		em = emf.createEntityManager();
	}
	
	public CityEntity createCityEntity() {
		CityEntity cityEntity = new CityEntity();
		cityEntity.setId(1);
		cityEntity.setName("test");
		cityEntity.setVisibility(1);
		cityEntity.setCoordEntity(getCoordEntity());
		emf.persist(cityEntity);
		return cityEntity;
	}
	
	public Clouds generateClouds() {
		Clouds clouds = new Clouds();
		clouds.setAll(1);
		return clouds;
	}
	
	public CoordEntity getCoordEntity() {
		CoordEntity coord = new CoordEntity();
		coord.setLat(1.1);
		coord.setLon(1.2);
		return coord;
	}
}
