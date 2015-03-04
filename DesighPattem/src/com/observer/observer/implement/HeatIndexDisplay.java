package com.observer.observer.implement;

import com.observer.observer.DisplayElement;
import com.observer.observer.HeatIndex;

public class HeatIndexDisplay implements HeatIndex, DisplayElement{

	private float T;
	private float RH;
	private float heatIndex;
	@Override
	public void heatIndex(float temperature, float humity) {
		this.T = temperature;
		this.RH = humity;
		caculatorHeatIndex();
		display();
	}
	
	private void caculatorHeatIndex(){
		heatIndex = (float)((16.923 + (0.185212 * T) + (5.37941 * RH) - (0.100254 * T * RH) +
		            (0.00941695 * (T * T)) + (0.00728898 * (RH * RH)) +
		            (0.000345372 * (T * T * RH)) - (0.000814971 * (T * RH * RH)) +
		            (0.0000102102 * (T * T * RH * RH)) - (0.000038646 * (T * T * T)) + (0.0000291583 *  
		            (RH * RH * RH)) + (0.00000142721 * (T * T * T * RH)) +
		            (0.000000197483 * (T * RH * RH * RH)) - (0.0000000218429 * (T * T * T * RH * RH)) +     
		            0.000000000843296 * (T * T * RH * RH * RH)) -
		            (0.0000000000481975 * (T * T * T * RH * RH * RH)));
	}

	@Override
	public void display() {
		System.out.println("Heat Indext "+ heatIndex);
		
	}

	

	public float getT() {
		return T;
	}

	public void setT(float t) {
		T = t;
	}

	public float getRH() {
		return RH;
	}

	public void setRH(float rH) {
		RH = rH;
	}

	public float getHeatIndex() {
		return heatIndex;
	}

	public void setHeatIndex(float heatIndex) {
		this.heatIndex = heatIndex;
	}
	
	

}
