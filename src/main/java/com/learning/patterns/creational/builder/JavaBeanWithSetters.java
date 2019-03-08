package com.learning.patterns.creational.builder;

/**
 * Demonstrates that although flexible with number of field initialization, the
 * object is mutable.
 * 
 * @author I341876
 *
 */
public class JavaBeanWithSetters {

	private String bread;
	private String codiments;
	private String dressing;
	private String meat;

	/**
	 * Gets the bread type
	 * 
	 * @return the bread type
	 */
	public String getBread() {
		return bread;
	}

	/**
	 * Sets the bread type
	 * 
	 * @param bread
	 *            the bread type
	 */
	public void setBread(String bread) {
		this.bread = bread;
	}

	/**
	 * Gets the codiments
	 * 
	 * @return the codiments
	 */
	public String getCodiments() {
		return codiments;
	}

	/**
	 * Sets the codiments
	 * 
	 * @param codiments
	 *            the codiments
	 */
	public void setCodiments(String codiments) {
		this.codiments = codiments;
	}

	/**
	 * Gets dressing over the sandwich
	 * 
	 * @return the dressing over sandwich
	 */
	public String getDressing() {
		return dressing;
	}

	/**
	 * Sets dressing over the sandwich
	 * 
	 * @param dressing
	 */
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	/**
	 * Gets type of meat in the sandwich
	 * 
	 * @return
	 */
	public String getMeat() {
		return meat;
	}

	/**
	 * Sets type of meat in the sandwich
	 * 
	 * @param meat
	 */
	public void setMeat(String meat) {
		this.meat = meat;
	}
}
