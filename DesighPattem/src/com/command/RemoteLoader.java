package com.command;

public class RemoteLoader {
	public static void main(String[] args) {
		Light lightKitchen = new Light("Kitchen");
		Light lightLivingRoom = new Light("Living room");
		LightOnCommand lightOnCommand = new LightOnCommand(lightKitchen);
		LightOnCommand lightOffCommand = new LightOnCommand(lightLivingRoom);
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
	}
}
