package com.factory.abtract.pizza.implement;

import com.factory.abtract.Pizza;
import com.factory.abtract.ingredient.factory.IngredientFactory;

public class ClamPizza extends Pizza{

	private IngredientFactory ingredienFactory;
	
	public ClamPizza(IngredientFactory ingredientFactory) {
		this.ingredienFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		setCheese(ingredienFactory.createChesse());
		setClam(ingredienFactory.createClam());
		setDough(ingredienFactory.createDough());
		setSauce(ingredienFactory.createSauce());
		setVeggies(ingredienFactory.createVegies());
		
	}

}
