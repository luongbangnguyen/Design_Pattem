package com.factory.abtract.ingredient.factory;

import com.factory.abtract.ingredient.Chesse;
import com.factory.abtract.ingredient.Clams;
import com.factory.abtract.ingredient.Dough;
import com.factory.abtract.ingredient.Pepperoni;
import com.factory.abtract.ingredient.Sauce;
import com.factory.abtract.ingredient.Veggies;

public interface IngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Chesse createChesse();
	Veggies[] createVegies();
	Clams createClam();
}
