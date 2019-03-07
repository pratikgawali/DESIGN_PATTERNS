package com.learning.patterns.creational.singleton;

/**
 * Demonstrates doubly checked locking implementation of singleton design
 * pattern.
 * 
 * @author I341876
 *
 */
public class DoublyCheckedLockingSingleton {

	private static DoublyCheckedLockingSingleton instance = null;

	/**
	 * Private constructor to restrict instantiation
	 */
	private DoublyCheckedLockingSingleton() {
	}

	/**
	 * Gets the singleton instance of {@link DoublyCheckedLockingSingleton}
	 * 
	 * @return the singleton instance
	 */
	public static DoublyCheckedLockingSingleton getInstance() {
		if (instance == null) {
			synchronized (DoublyCheckedLockingSingleton.class) {
				if (instance == null) {
					instance = new DoublyCheckedLockingSingleton();
				}
			}
		}
		return instance;
	}
}