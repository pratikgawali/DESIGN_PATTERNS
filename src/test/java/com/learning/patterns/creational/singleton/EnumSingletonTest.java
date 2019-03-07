package com.learning.patterns.creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for {@link EnumSingleton}
 * 
 * @author I341876
 *
 */
public class EnumSingletonTest {

	/**
	 * Tests single instantiation by ENUM.
	 */
	@Test
	public void shallReturnSameInstanceOnMultipleInstanceCall() {
		assertEquals("Must return the same instance which was created the first time", EnumSingleton.INSTANCE,
				EnumSingleton.INSTANCE);
	}

}
