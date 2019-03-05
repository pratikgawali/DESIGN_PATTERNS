package com.learning.patterns.creational.singleton;

/**
 * Demonstrates lazy loaded implementation of singleton design pattern.
 * 
 * @author I341876
 *
 */
public class DbLazyLoadedSingleton {

	private static DbLazyLoadedSingleton instance = null;

	/**
	 * Private constructor to restrict instantiation
	 */
	private DbLazyLoadedSingleton() {
	}

	/**
	 * Gets the singleton instance of {@link DbLazyLoadedSingleton}
	 * 
	 * @return the singleton instance
	 */
	public static DbLazyLoadedSingleton getInstance() {
		return instance == null ? instance = new DbLazyLoadedSingleton() : instance;
	}
}


/*
 *----------------------------------------------------------------------------------------------------------------
 * PROs: 
 * ------
 * 		1. Instantiation only when needed (ideal when instance creation is expensive and rare)
 * ----------------------------------------------------------------------------------------------------------------
 * CONs: 
 * ------
 * 		1. Not thread safe
 * ----------------------------------------------------------------------------------------------------------------
 */