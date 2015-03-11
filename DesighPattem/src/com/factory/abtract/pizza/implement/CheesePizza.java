package com.factory.abtract.pizza.implement;

import com.factory.abtract.Pizza;
import com.factory.abtract.ingredient.factory.IngredientFactory;

public class CheesePizza extends Pizza {
	
	private IngredientFactory ingredientFactory;
	
	public CheesePizza(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		setCheese(ingredientFactory.createChesse());
		setClam(ingredientFactory.createClam());
		setDough(ingredientFactory.createDough());
		setSauce(ingredientFactory.createSauce());
		setVeggies(ingredientFactory.createVegies());
		

	}

}
