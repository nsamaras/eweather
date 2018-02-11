package com.eweather.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.eweather.app.Address;
import com.eweather.app.PopulateCity;
import com.eweather.app.User;
import com.eweather.entity.City;

public class EweatherServiceImpl extends BaseEntityManager implements EweatherService  {

	private EntityTransaction txn;
	
	@Override
	public String findCitiesByIds(String baseUrl, String apiKey, List<String> cityIds) {
		return null;
	}

	@Override
	public String findCityById(String baseUrl, String apiKey, Integer cityId) {
		return null;
	}

	@Override
	public void save(City city) {
		try {
			txn = em.getTransaction();
			txn.begin();
			em.persist(city);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
		} finally {
			em.close();
		}
	}
	
	/*public void saveCoord(City city) {
		try {
			txn = em.getTransaction();
			txn.begin();
			em.persist(city);
			txn.commit();
		} catch (Exception e) {
			txn.rollback();
		} finally {
			em.close();
		}
	}*/

}
