package com.worldcupteam;

import java.util.ArrayList;
import java.util.List;

public class PlayerManagment {

	
List<Batsman> batsman;
List<Bowler> bowler;

public PlayerManagment() {
	this.batsman=new ArrayList<>(6);
	this.bowler=new ArrayList<>(5);
}
	
	public void addPlayer(Player player) {
		if(player instanceof Bowler) {
			bowler.add((Bowler)player);
			
		}else if(player instanceof Batsman) {
			batsman.add((Batsman)player);
			
		}
		else {
			throw new IllegalArgumentException("Player is not recomonded");
		}
	}
	
	public void removePlayer(Player player) {
		if(player instanceof Bowler) {
			bowler.remove((Bowler)player);
			
		}else if(player instanceof Batsman) {
			batsman.remove((Batsman)player);
			
		}
		else {
			throw new IllegalArgumentException("Player is not recomonded");
		}
	}
	
	
}
