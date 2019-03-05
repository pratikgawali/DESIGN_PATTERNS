package com.learning.patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link EagerlyLoadedSingleton}
 * 
 * @author I341876
 *
 */
public class EagerlyLoadedSingletonTest {

	/**
	 * Test for {@link EagerlyLoadedSingleton#getInstance() getInstance()} to check
	 * if same instance is returned which was created for the first time.
	 */
	@Test
	public void getInstanceTest() {

		EagerlyLoadedSingleton instance = EagerlyLoadedSingleton.getInstance();

		assertEquals("Must return the same instance which was created the first time", instance,
				EagerlyLoadedSingleton.getInstance());
	}

}
