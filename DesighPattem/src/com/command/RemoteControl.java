package com.command;

public class RemoteControl {
	Command[] onCommans;
	Command[] offCommans;
	
	public RemoteControl() {
		onCommans = new Command[7];
		offCommans = new Command[7];
	}
	
	public void setCommand(int slot, Command onCommand, Command ofCommand){
		onCommans[slot] = onCommand;
		offCommans[slot] = ofCommand;
	}
	
	public void onButtonWasPushed (int slot){
		onCommans[slot].execute();
	}
	
	public void offButtonWasPushed(int slot){
		offCommans[slot].execute();
	}
}
