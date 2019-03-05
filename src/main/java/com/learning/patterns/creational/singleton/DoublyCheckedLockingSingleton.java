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


/*
 *----------------------------------------------------------------------------------------------------------------
 * PROs: 
 * ------
 * 		1. Instantiation only when needed (ideal when instance creation is expensive and rare). 
 * 		   As a result faster application start up compared to eagerly loaded singleton pattern.
 * 		
 * 		2. Thread safe
 * ----------------------------------------------------------------------------------------------------------------
 * CONs: 
 * ------
 * 		1. It does not work reliably in a platform-independent manner without additional
 *         synchronization for mutable instances of anything other than float or int.
 * ----------------------------------------------------------------------------------------------------------------
 */