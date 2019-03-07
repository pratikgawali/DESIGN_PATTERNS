package com.learning.patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link BillPughSingleton}
 * 
 * @author I341876
 *
 */
public class BillPughSingletonTest {

	/**
	 * Test for {@link BillPughSingleton#getInstance() getInstance()} to check
	 * if same instance is returned which was created for the first time.
	 */
	@Test
	public void getInstanceTest() {

		BillPughSingleton instance = BillPughSingleton.getInstance();

		assertEquals("Must return the same instance which was created the first time", instance,
				BillPughSingleton.getInstance());
	}

}
