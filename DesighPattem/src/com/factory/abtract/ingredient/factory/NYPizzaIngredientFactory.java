package com.factory.abtract.ingredient.factory;

import com.factory.abtract.ingredient.Chesse;
import com.factory.abtract.ingredient.Clams;
import com.factory.abtract.ingredient.Dough;
import com.factory.abtract.ingredient.Sauce;
import com.factory.abtract.ingredient.Veggies;
import com.factory.abtract.ingredient.implement.FreshClams;
import com.factory.abtract.ingredient.implement.MarinaraSauce;
import com.factory.abtract.ingredient.implement.ReggianoChesse;
import com.factory.abtract.ingredient.implement.ThinCrustDough;

public class NYPizzaIngredientFactory implements IngredientFactory{

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Chesse createChesse() {
		return new ReggianoChesse();
	}

	@Override
	public Veggies[] createVegies() {
		Veggies[] arrayVeggies = {new Veggies("Veggies 4"), new Veggies("Veggies 5"), new Veggies("Veggies 6")};
		return arrayVeggies;
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
