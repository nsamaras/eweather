package com.eweather.service;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseEntityManagerFactory {

protected EntityManagerFactory emf;
	
	protected BaseEntityManagerFactory() {
		// Check in the resources/META-INF/persistence.xml the persistence-unit name="persistenceUnitExample"
		String persistenceUnit = "persistenceUnit";
		emf =  Persistence.createEntityManagerFactory(persistenceUnit);
	}
}
