package com.learning.patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link DbLazyLoadedSingleton}
 * 
 * @author I341876
 *
 */
public class DbLazyLoadedSingletonTest {

	/**
	 * Test for {@link DbLazyLoadedSingleton#getInstance() getInstance()} to check
	 * if same instance is returned which was created for the first time.
	 */
	@Test
	public void getInstanceTest() {

		DbLazyLoadedSingleton instance = DbLazyLoadedSingleton.getInstance();

		assertEquals("Must return the same instance which was created the first time", instance,
				DbLazyLoadedSingleton.getInstance());
	}

}
