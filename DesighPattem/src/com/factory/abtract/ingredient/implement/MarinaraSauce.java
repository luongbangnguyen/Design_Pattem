package com.factory.abtract.ingredient.implement;

import com.factory.abtract.ingredient.Sauce;

public class MarinaraSauce extends Sauce {
	public MarinaraSauce(){
		setDescription("Marinara Sauce");
		setSauceType(SAUCE_TYPE.medium);
	}
}
