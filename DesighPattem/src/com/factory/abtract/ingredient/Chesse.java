package com.factory.abtract.ingredient;

public class Chesse extends Ingredient{
	
	public enum SWEETNESS{
		low,medium,hight;
	}
	
	private SWEETNESS sweetness;

	public SWEETNESS getSweetness() {
		return sweetness;
	}

	public void setSweetness(SWEETNESS sweetness) {
		this.sweetness = sweetness;
	}
	
	
}
