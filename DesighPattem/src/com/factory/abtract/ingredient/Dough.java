package com.factory.abtract.ingredient;

public class Dough extends Ingredient{
	public enum THICKNESS{
		thin,medium,thick;
	}
	
	private THICKNESS thickness;

	public THICKNESS getThickness() {
		return thickness;
	}

	public void setThickness(THICKNESS thickness) {
		this.thickness = thickness;
	}
	
}
