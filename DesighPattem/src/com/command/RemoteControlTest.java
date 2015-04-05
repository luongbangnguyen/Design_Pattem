package com.command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl simpleControl = new SimpleRemoteControl();
		Light light = new Light("Living Room");
		LightOnCommand lightOnComman = new LightOnCommand(light);
		simpleControl.setCommand(lightOnComman);
		simpleControl.buttonPressd();
	}
}
