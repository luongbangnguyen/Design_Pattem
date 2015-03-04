package com.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.observer.observer.Observer;

/**
 * 
 * @author bangnl
 *
 */
public class WeatherData implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;

	private List<Observer> arrayObserver;

	public WeatherData() {
		arrayObserver = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		arrayObserver.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		int index = arrayObserver.indexOf(observer);
		if (index > 0) {
			arrayObserver.remove(index);
		}
	}

	@Override
	public void notificationObserserver() {
		arrayObserver.stream().forEach(ob -> ob.update(this.temperature, this.humidity, this.pressure));

	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notificationObserserver();
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

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
