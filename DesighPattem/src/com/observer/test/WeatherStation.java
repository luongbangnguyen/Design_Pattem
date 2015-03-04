package com.observer.test;

import com.observer.observer.implement.CurrentConditionsDisplay;
import com.observer.observer.implement.StaticsDisplay;
import com.observer.subject.WeatherData;

public class WeatherStation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentCondition = new CurrentConditionsDisplay(weatherData);
		StaticsDisplay statics = new StaticsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.5f);
		weatherData.setMeasurements(81, 64, 35.5f);
		weatherData.setMeasurements(82, 63, 36.5f);
	}
}
