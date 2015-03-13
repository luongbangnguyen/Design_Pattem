package com.command;

public class SimpleRemoteControl {
	private Command slot;
	
	public void setCommand(Command command){
		this.slot = command;
	}
	public void buttonPressd(){
		slot.execute();
	}
}
