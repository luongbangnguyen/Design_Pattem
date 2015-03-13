package com.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl simpleControl = new SimpleRemoteControl();
		Light light = new Light();
		LightOnComman lightOnComman = new LightOnComman(light);
		simpleControl.setCommand(lightOnComman);
		simpleControl.buttonPressd();
	}
}
