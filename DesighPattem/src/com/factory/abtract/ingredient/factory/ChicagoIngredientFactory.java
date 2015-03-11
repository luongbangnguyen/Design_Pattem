package com.factory.abtract.ingredient.factory;

import com.factory.abtract.ingredient.Chesse;
import com.factory.abtract.ingredient.Clams;
import com.factory.abtract.ingredient.Dough;
import com.factory.abtract.ingredient.Pepperoni;
import com.factory.abtract.ingredient.Sauce;
import com.factory.abtract.ingredient.Veggies;
import com.factory.abtract.ingredient.implement.FrozenClams;
import com.factory.abtract.ingredient.implement.MozzallaCheesee;
import com.factory.abtract.ingredient.implement.PlumTomatoSause;
import com.factory.abtract.ingredient.implement.ThickCrustDough;


public class ChicagoIngredientFactory implements IngredientFactory{
	
	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSause();
	}

	@Override
	public Chesse createChesse() {
		return new MozzallaCheesee();
	}

	@Override
	public Veggies[] createVegies() {
		Veggies[] arrayVeggies = {new Veggies("Veggies1"),new Veggies("Veggies2"), new Veggies("Veggies 3")};
		return arrayVeggies;
	}


	@Override
	public Clams createClam() {
		return new FrozenClams();
	}
	
}
