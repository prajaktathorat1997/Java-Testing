package com.worldcupteam;

public abstract class Player {
String name;
int jerseyNo;
	public Player(String name,int jerseyNo) {
		this.name=name;
	this. jerseyNo=jerseyNo;
	}
	
	
	public abstract void roll();

}
