package com.decorator.component.concrete;

import com.decorator.component.Beverage;

public class Expresso extends Beverage{

	public Expresso(SIZE size){
		this();
		setSize(size);
	}
	
	public Expresso() {
		setDescription("Coffe Expresso");
		setSize(SIZE.MEDIUM);
	}
	
	@Override
	public double getCost() {
		return 1.99;
	}

}
