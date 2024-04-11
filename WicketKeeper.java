package com.worldcupteam;

public class WicketKeeper extends Batsman{

	public WicketKeeper(String name,int jerseyNo) {
		super(name,jerseyNo);
	}
	@Override
	public void roll() {
		System.out.println(name+" is a wicket keeper batsman");
		
	}

}
