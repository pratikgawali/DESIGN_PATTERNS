package com.learning.patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link DoublyCheckedLockingSingleton}
 * 
 * @author I341876
 *
 */
public class DoublyCheckedLockingSingletonTest {

	/**
	 * Test for {@link DoublyCheckedLockingSingleton#getInstance()
	 * getInstance()} to check if same instance is returned which was created
	 * for the first time.
	 */
	@Test
	public void getInstanceTest() {

		DoublyCheckedLockingSingleton instance = DoublyCheckedLockingSingleton.getInstance();

		assertEquals("Must return the same instance which was created the first time", instance,
				DoublyCheckedLockingSingleton.getInstance());
	}

}
