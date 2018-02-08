package com.eweather.service;

import javax.persistence.EntityManager;


public class BaseEntityManager extends BaseEntityManagerFactory {

protected EntityManager em;
	
	public BaseEntityManager() {
		em = emf.createEntityManager();
	}
}
