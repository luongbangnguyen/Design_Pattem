package com.command;

public class LightOnComman implements Command{

	private Light light;
	
	public LightOnComman(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.on();
		
	}
	
}
