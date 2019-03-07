package com.learning.patterns.creational.singleton;

/**
 * Demonstrates lazy loaded implementation of singleton design pattern.
 * 
 * @author I341876
 *
 */
public class LazyLoadedSingleton {

	private static LazyLoadedSingleton instance = null;

	/**
	 * Private constructor to restrict instantiation
	 */
	private LazyLoadedSingleton() {
	}

	/**
	 * Gets the singleton instance of {@link LazyLoadedSingleton}
	 * 
	 * @return the singleton instance
	 */
	public static LazyLoadedSingleton getInstance() {
		return instance == null ? instance = new LazyLoadedSingleton() : instance;
	}
}