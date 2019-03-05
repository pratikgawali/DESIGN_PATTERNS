package com.learning.patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link LazyLoadedSingleton}
 * 
 * @author I341876
 *
 */
public class LazyLoadedSingletonTest {

	/**
	 * Test for {@link LazyLoadedSingleton#getInstance() getInstance()} to check
	 * if same instance is returned which was created for the first time.
	 */
	@Test
	public void getInstanceTest() {

		LazyLoadedSingleton instance = LazyLoadedSingleton.getInstance();

		assertEquals("Must return the same instance which was created the first time", instance,
				LazyLoadedSingleton.getInstance());
	}

}
