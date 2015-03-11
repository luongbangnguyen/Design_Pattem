package com.factory.abtract.ingredient;

public class Veggies extends Ingredient{
	private String region;

	public Veggies(String description){
		setDescription(description);
	}
	
	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	

}
