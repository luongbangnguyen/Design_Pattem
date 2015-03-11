package com.factory.abtract.test;

import com.factory.abtract.ChicagoPizzaStore;
import com.factory.abtract.NYPizzaStore;
import com.factory.abtract.Pizza;
import com.factory.abtract.PizzaStore;

public class PizzaTestDriver {
	public static void main(String[] args) {
		PizzaStore pizzaStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizzaNewYork = pizzaStore.orderPiza("cheese");
		System.out.println(pizzaNewYork.getName() + pizzaNewYork.getCheese().getDescription());
		
		Pizza pizzaChiCago = chicagoStore.orderPiza("Clame");
		System.out.println(pizzaChiCago.getName() + pizzaChiCago.getClam().getDescription());
		
	}
}
