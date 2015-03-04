package com.decorator.component;

public abstract class Beverage {
	
	public enum SIZE{
		SMALL, MEDIUM, LAGE
	}
	
	private SIZE size;
	private String description;
	public abstract double getCost();
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SIZE getSize() {
		return size;
	}

	public void setSize(SIZE size) {
		this.size = size;
	}
	
	
	

}
