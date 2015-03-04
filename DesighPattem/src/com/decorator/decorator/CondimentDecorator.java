package com.decorator.decorator;

import com.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage{
	private Beverage beverage;
	public abstract String getDescription();
	public Beverage getBeverage() {
		return beverage;
	}
	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	

}
