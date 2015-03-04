package com.observer.observer.implement;

import com.observer.observer.DisplayElement;
import com.observer.observer.HeatIndex;
import com.observer.observer.Observer;
import com.observer.subject.Subject;

public class StaticsDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private HeatIndex heatIndex;
	
	public StaticsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
		heatIndex = new HeatIndexDisplay();
	}
	
	@Override
	public void display() {
		System.out.println("Statics Avg/Max/Min "+ this.temperature +"/"+ this.temperature +"/"+ this.temperature);
		heatIndex.heatIndex(this.temperature, 0);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		display();
		
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	

}
