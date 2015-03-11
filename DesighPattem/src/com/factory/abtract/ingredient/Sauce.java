package com.factory.abtract.ingredient;

public class Sauce extends Ingredient{
	public enum SAUCE_TYPE{
		special,medium,diluted;
	}
	private SAUCE_TYPE sauceType;
	
	public SAUCE_TYPE getSauceType() {
		return sauceType;
	}
	public void setSauceType(SAUCE_TYPE sauceType) {
		this.sauceType = sauceType;
	}
	
	
}
