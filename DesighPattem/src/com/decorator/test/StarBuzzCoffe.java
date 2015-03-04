package com.decorator.test;

import com.decorator.component.Beverage;
import com.decorator.component.concrete.Expresso;
import com.decorator.decorator.concrete.Discount;
import com.decorator.decorator.concrete.Mocha;
import com.decorator.decorator.concrete.Soy;

public class StarBuzzCoffe {
	
	public static void main(String[] args) {
		Beverage expresso = new Expresso();
		expresso = new Mocha(expresso);
		expresso = new Mocha(expresso);
		expresso = new Soy(expresso);
		expresso = new Discount(expresso);
		expresso = new Discount(expresso);
		
		double a = 0;
		
		a = expresso.getCost();
		System.out.println(a);
	}

}
