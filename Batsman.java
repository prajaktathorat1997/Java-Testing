package com.worldcupteam;

public class Batsman extends Player {

	public Batsman(String name,int jerseyNo) {
		super(name,jerseyNo);
	}

	@Override
	public void roll() {
		System.out.println(name+" is a batsman");
		
	}

}
