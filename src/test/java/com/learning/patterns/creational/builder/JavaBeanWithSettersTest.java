package com.learning.patterns.creational.builder;

import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link JavaBeanWithSetters}
 * 
 * @author I341876
 *
 */
public class JavaBeanWithSettersTest {

	private JavaBeanWithSetters classUnderTest;

	private static final String TEST_DATA_BREAD1 = "bread1";
	private static final String TEST_DATA_BREAD2 = "bread2";

	/**
	 * Initializes the prerequisites before running each test case
	 */
	@Before
	public void setUp() {
		classUnderTest = new JavaBeanWithSetters();
	}

	/**
	 * Tests that a java bean with setter is a mutable object
	 */
	@Test
	public void javaBeanWithSettersIsMutable() {

		String unexpectedBreadValue = TEST_DATA_BREAD1;
		classUnderTest.setBread(unexpectedBreadValue);

		// if immutable, bread value must not be updated
		classUnderTest.setBread(TEST_DATA_BREAD2);

		assertNotEquals(unexpectedBreadValue, classUnderTest.getBread());
	}

}
