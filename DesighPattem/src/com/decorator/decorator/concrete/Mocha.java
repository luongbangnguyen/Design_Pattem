package com.decorator.decorator.concrete;

import com.decorator.component.Beverage;
import com.decorator.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator{

	
	public Mocha( Beverage beverage) {
		if(beverage.getSize() != null){
			setSize(beverage.getSize());
		}
		
		setSize(SIZE.MEDIUM);
		setBeverage(beverage);
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public String getDescription() {
		switch (getSize()) {
		case SMALL:
			return getBeverage().getDescription() + ", small Mocha";
		case LAGE:
			return getBeverage().getDescription() + ", lage Mocha";
		}
		return getBeverage().getDescription() + ", medium Mocha";
	}

	@SuppressWarnings("incomplete-switch")
	@Override
	public double getCost() {
		switch (getSize()) {
		case SMALL:
			return getBeverage().getCost() + .15;
		case LAGE:
			return  getBeverage().getCost() + .30;
		}
		return getBeverage().getCost() + .20;
	}

}
