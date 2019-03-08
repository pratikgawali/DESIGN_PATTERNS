package com.learning.patterns.creational.builder;

/**
 * Demonstrates the Builder pattern which gives us flexibility with fields and
 * gives an immutable object.
 * 
 * @author I341876
 *
 */
public class JavaBeanWithBuilder {

	public static class Builder {

		private String bread;
		private String codiments;
		private String dressing;
		private String meat;

		/**
		 * Builds an immutable instance of {@link JavaBeanWithBuilder}
		 * 
		 * @return immutable {@link JavaBeanWithBuilder} instance
		 */
		public JavaBeanWithBuilder build() {
			JavaBeanWithBuilder javaBean = new JavaBeanWithBuilder();
			javaBean.bread = this.bread;
			javaBean.codiments = this.codiments;
			javaBean.dressing = this.dressing;
			javaBean.meat = this.meat;
			return javaBean;
		}

		/**
		 * Add bread to the sandwich
		 * 
		 * @param bread
		 * @return the {@link Builder} instance
		 */
		public Builder addBread(String bread) {
			this.bread = bread;
			return this;
		}

		/**
		 * Add codiments to the sandwich
		 * 
		 * @param codiments
		 * @return the {@link Builder} instance
		 */
		public Builder addCodiments(String codiments) {
			this.codiments = codiments;
			return this;
		}

		/**
		 * Add dressing to the sandwich
		 * 
		 * @param dressing
		 * @return the {@link Builder} instance
		 */
		public Builder addDressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		/**
		 * Add meat to the sandwich
		 * 
		 * @param meat
		 * @return the {@link Builder} instance
		 */
		public Builder addMeat(String meat) {
			this.meat = meat;
			return this;
		}
	}

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
	 * Gets the codiments
	 * 
	 * @return the codiments
	 */
	public String getCodiments() {
		return codiments;
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
	 * Gets type of meat in the sandwich
	 * 
	 * @return
	 */
	public String getMeat() {
		return meat;
	}
}
