package com.learning.patterns.creational.singleton;

/**
 * Demonstrates eagerly loaded implementation of singleton design pattern.
 * 
 * @author I341876
 */
public class DbEagerlyLoadedSingleton {

	private static DbEagerlyLoadedSingleton instance = new DbEagerlyLoadedSingleton();

	/**
	 * Private constructor to restrict instantiation
	 */
	private DbEagerlyLoadedSingleton() {
	}

	/**
	 * Gets the singleton instance of {@link DbEagerlyLoadedSingleton}
	 * 
	 * @return the singleton instance
	 */
	public static DbEagerlyLoadedSingleton getInstance() {
		return instance;
	}

}

/*
 *----------------------------------------------------------------------------------------------------------------
 * PROs: 
 * ------
 * 		1. Thread Safe (Class loading by JVM is thread safe)
 * ----------------------------------------------------------------------------------------------------------------
 * CONs: 
 * ------
 * 		1. Unnecessary instantiation of singleton when instance creation is very expensive
 * 		   operation and it is uncertain whether the instance would be used at all.
 * ----------------------------------------------------------------------------------------------------------------
 */