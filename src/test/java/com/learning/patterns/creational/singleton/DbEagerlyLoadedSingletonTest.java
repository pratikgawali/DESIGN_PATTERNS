package com.learning.patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link DbEagerlyLoadedSingleton}
 * 
 * @author I341876
 *
 */
public class DbEagerlyLoadedSingletonTest {

	/**
	 * Test for {@link DbEagerlyLoadedSingleton#getInstance() getInstance()} to check
	 * if same instance is returned which was created for the first time.
	 */
	@Test
	public void getInstanceTest() {

		DbEagerlyLoadedSingleton instance = DbEagerlyLoadedSingleton.getInstance();

		assertEquals("Must return the same instance which was created the first time", instance,
				DbEagerlyLoadedSingleton.getInstance());
	}

}
