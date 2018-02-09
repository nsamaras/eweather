package com.eweather.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class BaseEntityManager extends BaseEntityManagerFactory {

	protected EntityManager em;
	public BaseEntityManager() {
		em = emf.createEntityManager();
	}
}
