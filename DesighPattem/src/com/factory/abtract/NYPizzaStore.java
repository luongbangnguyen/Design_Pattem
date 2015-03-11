package com.factory.abtract;

import com.factory.abtract.ingredient.Chesse;
import com.factory.abtract.ingredient.Veggies;
import com.factory.abtract.ingredient.factory.IngredientFactory;
import com.factory.abtract.ingredient.factory.NYPizzaIngredientFactory;
import com.factory.abtract.pizza.implement.CheesePizza;
import com.factory.abtract.pizza.implement.ClamPizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza =null;
		IngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		if(type.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else{
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clame Pizza");
		}
		
		return pizza;
	}

}
