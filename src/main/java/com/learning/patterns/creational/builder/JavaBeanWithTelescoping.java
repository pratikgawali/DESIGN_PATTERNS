package com.learning.patterns.creational.builder;

/**
 * Demonstrates that although immutable, the complexity due to various possible
 * combinations of constructors.
 * 
 * @author I341876
 *
 */
public class JavaBeanWithTelescoping {

	private String bread;
	private String codiments;
	private String dressing;
	private String meat;

	/**
	 * Parameterized constructor
	 * 
	 * @param bread
	 */
	public JavaBeanWithTelescoping(String bread) {
		super();
		this.bread = bread;
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param bread
	 * @param codiments
	 */
	public JavaBeanWithTelescoping(String bread, String codiments) {
		super();
		this.bread = bread;
		this.codiments = codiments;
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param bread
	 * @param codiments
	 * @param dressing
	 */
	public JavaBeanWithTelescoping(String bread, String codiments, String dressing) {
		super();
		this.bread = bread;
		this.codiments = codiments;
		this.dressing = dressing;
	}

	/**
	 * Parameterized constructor
	 * 
	 * @param bread
	 * @param codiments
	 * @param dressing
	 * @param meat
	 */
	public JavaBeanWithTelescoping(String bread, String codiments, String dressing, String meat) {
		super();
		this.bread = bread;
		this.codiments = codiments;
		this.dressing = dressing;
		this.meat = meat;
	}

	// Similarly there are many more parameterized constructors possible
}
