package com.factory.abtract;

import com.factory.abtract.ingredient.Chesse;
import com.factory.abtract.ingredient.Clams;
import com.factory.abtract.ingredient.Dough;
import com.factory.abtract.ingredient.Pepperoni;
import com.factory.abtract.ingredient.Sauce;
import com.factory.abtract.ingredient.Veggies;

public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private Veggies veggies[];
	private Chesse cheese;
	private Pepperoni pepperoni;
	private Clams clam;
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("Bake for 25 minute at 350");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place pizza in offical PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Veggies[] getVeggies() {
		return veggies;
	}

	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	public Chesse getCheese() {
		return cheese;
	}

	public void setCheese(Chesse cheese) {
		this.cheese = cheese;
	}

	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	public Clams getClam() {
		return clam;
	}

	public void setClam(Clams clam) {
		this.clam = clam;
	}

}
