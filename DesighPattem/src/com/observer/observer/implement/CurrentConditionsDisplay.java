package com.observer.observer.implement;

import com.observer.observer.DisplayElement;
import com.observer.observer.HeatIndex;
import com.observer.observer.Observer;
import com.observer.subject.Subject;

public class CurrentConditionsDisplay implements DisplayElement,  Observer {

	private float temperature;
	private float humidity;
	private HeatIndex heatIndex;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
		heatIndex = new HeatIndexDisplay();
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();

	}

	@Override
	public void display() {
		System.out.println("Current condition : "+temperature + "F degrees and "+humidity+"% humidity");
		heatIndex.heatIndex(this.temperature, this.humidity);

	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	

}
