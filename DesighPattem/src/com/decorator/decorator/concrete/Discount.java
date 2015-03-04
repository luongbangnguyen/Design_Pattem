package com.decorator.decorator.concrete;

import com.decorator.component.Beverage;
import com.decorator.decorator.CondimentDecorator;

public class Discount extends CondimentDecorator{
	
	public Discount(Beverage beverage) {
		setBeverage(beverage);
	}

	@Override
	public String getDescription() {
		return getBeverage().getDescription() + ", discount 10%";
	}

	@Override
	public double getCost() {
		return getBeverage().getCost() - getBeverage().getCost() * 0.1;
	}

}
