package com.factory.abtract;

import com.factory.abtract.ingredient.factory.ChicagoIngredientFactory;
import com.factory.abtract.ingredient.factory.IngredientFactory;
import com.factory.abtract.pizza.implement.CheesePizza;
import com.factory.abtract.pizza.implement.ClamPizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		IngredientFactory ingredientFactory = new ChicagoIngredientFactory();
		
		if(type.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		}else{
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clame Pizza");
		}
		return pizza;
		
	}

}
