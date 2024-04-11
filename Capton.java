package com.worldcupteam;

public class Capton extends Bowler{

	public Capton(String name,int jerseyNo) {
		super(name,jerseyNo);
	}
	@Override
	public void roll() {
		System.out.println(name+" is a capton and bowler also");
		
	}

}
