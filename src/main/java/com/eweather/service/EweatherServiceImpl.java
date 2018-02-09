package com.eweather.service;

import java.util.List;

import javax.persistence.EntityTransaction;

import com.eweather.app.Address;
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
		
	}
	
	public void saveCoord() {
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();*/
		txn = em.getTransaction();
		txn.begin();
		User user = new User();
		user.setId(4);
		user.setName("test");
		user.setEmail("email@email.gr");
		Address add = new Address();
		add.setId(1L);
		add.setName("name");
		user.setAddress(add);
		
		em.persist(user);
		txn.commit();
	}

}
