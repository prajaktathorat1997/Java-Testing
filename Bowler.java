package com.worldcupteam;

public class Bowler extends Player{

	public Bowler(String name,int jerseyNo) {
		super(name,jerseyNo);
	}

	@Override
	public void roll() {
		System.out.println(name+" is a bowler");
		
	}

}
