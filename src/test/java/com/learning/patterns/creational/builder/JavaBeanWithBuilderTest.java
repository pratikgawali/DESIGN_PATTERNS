package com.learning.patterns.creational.builder;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * Test class for {@link JavaBeanWithBuilder}
 * 
 * @author I341876
 *
 */
public class JavaBeanWithBuilderTest {

	private static final String TEST_BREAD = "dummy bread";
	private static final String TEST_CODIMENTS = "dummy codiments";
	private static final String TEST_DRESSING = "dummy dressing";
	private static final String TEST_MEAT = "dummy meat";

	/**
	 * Tests that each instance created by {@link JavaBeanWithBuilder.Builder
	 * Builder} is an immutable object.
	 */
	@Test
	public void instanceCreatedWithBuilderIsImmutable() {

		JavaBeanWithBuilder.Builder builder = new JavaBeanWithBuilder.Builder();

		JavaBeanWithBuilder unexpectedJavaBean = builder.addBread(TEST_BREAD).addCodiments(TEST_CODIMENTS)
				.addDressing(TEST_DRESSING).addMeat(TEST_MEAT).build();
		JavaBeanWithBuilder actualJavaBean = builder.addBread(TEST_BREAD).addCodiments(TEST_CODIMENTS)
				.addDressing(TEST_DRESSING).addMeat(TEST_MEAT).build();

		assertNotEquals(unexpectedJavaBean, actualJavaBean);
	}

}
