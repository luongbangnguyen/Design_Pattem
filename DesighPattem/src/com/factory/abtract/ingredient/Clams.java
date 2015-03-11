package com.factory.abtract.ingredient;

public class Clams extends Ingredient{
	public enum ClamsType{
		
		medium(1,"123"),big(1,"45");
		
		private int value;
		private String text;
		
		private ClamsType(int value, String str){
			this.value = value;
			this.text = str;
		}
		
		int number;
		String description;

		public int getValue() {
			return value;
		}
		public String getText() {
			return text;
		}
		
		
	}
	
	private ClamsType clamsType;

	public ClamsType getClamsType() {
		return clamsType;
	}

	public void setClamsType(ClamsType clamsType) {
		this.clamsType = clamsType;
	}
	
	
	
	
}
