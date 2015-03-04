package com.decorator.decorator.concrete;

import com.decorator.component.Beverage;
import com.decorator.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator{

	
	public Soy(Beverage beverage) {
		setBeverage(beverage);
	}
	
	public Soy() {
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + " ,Soy";
	}

	@Override
	public double getCost() {
		return getBeverage().getCost() + .15;
	}

}
