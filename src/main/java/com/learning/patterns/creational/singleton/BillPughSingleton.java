package com.learning.patterns.creational.singleton;

/**
 * Demonstrates Bill Pugh inner static class implementation of singleton design
 * pattern.
 * 
 * @author I341876
 *
 */
public class BillPughSingleton {

	/**
	 * Helps singleton instantiation of {@link BillPughSingleton} class.
	 * 
	 * @author I341876
	 *
	 */
	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	/**
	 * Private constructor to restrict instantiation
	 */
	private BillPughSingleton() {
	}

	/**
	 * Gets the singleton instance of {@link BillPughSingleton}
	 * 
	 * @return the singleton instance
	 */
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}