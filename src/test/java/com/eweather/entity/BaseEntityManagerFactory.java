package com.eweather.entity;


import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseEntityManagerFactory {
	
	protected EntityManagerFactory emf;
	
	protected BaseEntityManagerFactory() {
		// Check in the resources/META-INF/persistence.xml the persistence-unit name="persistenceUnitExample"
		String persistenceUnitName = "persistenceUnitTest";
		emf =  Persistence.createEntityManagerFactory(persistenceUnitName);
	}
}

