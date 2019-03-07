package com.learning.patterns.creational.singleton;

/**
 * Demonstrates eagerly loaded implementation of singleton design pattern.
 * 
 * @author I341876
 */
public class EagerlyLoadedSingleton {

	private static EagerlyLoadedSingleton instance = new EagerlyLoadedSingleton();

	/**
	 * Private constructor to restrict instantiation
	 */
	private EagerlyLoadedSingleton() {
	}

	/**
	 * Gets the singleton instance of {@link EagerlyLoadedSingleton}
	 * 
	 * @return the singleton instance
	 */
	public static EagerlyLoadedSingleton getInstance() {
		return instance;
	}
}