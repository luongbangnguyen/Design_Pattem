package com.command;

public class Light {
	
	private String location;
	public Light(String location){
		this.location = location;
	}
	
	public void on(){
		System.out.println(this.location + " The light on");
	}
	public void off(){
		System.out.println(this.location +" The light off");
	}

}
