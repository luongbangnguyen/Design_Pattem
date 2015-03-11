package com.factory.abtract;

public abstract class PizzaStore {
	public Pizza orderPiza(String type){
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	public abstract Pizza createPizza(String type);
}
