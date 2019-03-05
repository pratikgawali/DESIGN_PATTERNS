package com.learning.patterns.creational.singleton;

/**
 * Demonstrates eagerly loaded implementation of singleton design pattern.
 * 
 * 
 * @author I341876
 *
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
