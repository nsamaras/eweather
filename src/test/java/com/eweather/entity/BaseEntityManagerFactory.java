package com.eweather.entity;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseEntityManagerFactory {
	
	protected EntityManagerFactory emf;
	
	protected BaseEntityManagerFactory() {
		// Check in the persistence.xml the persistence-unit name="persistenceUnitExample"
		String persistenceUnitName = "persistenceUnitExample";
		emf =  Persistence.createEntityManagerFactory(persistenceUnitName);
	}
}

