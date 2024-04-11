package com.worldcupteam;

public class CricketTeam {

	public CricketTeam() {
		
	}

	public static void main(String[] args) {
		Bowler b1=new Bowler("JASPRIT BUMRAH",93);
		Bowler b2=new Bowler("MOHMMAD SHAMI",11);
		Bowler b3=new Bowler("RAVINDRA JADEJA",8);
		Bowler b4=new Bowler("BHUVNESHWAR KUMAR",15);
		Capton b5=new Capton("HARDIK PANDYA",33);
		Batsman c1=new Batsman("VIRAT KOHLI",18);
		Batsman c2=new Batsman("ROHIT SHARMA",45);
		Batsman c3=new Batsman("SURESH RAINA",3);
		Batsman c4=new Batsman("AJINKYA RAHANE",23);
		Batsman c5=new Batsman("RUTURAJ GAIKWAD",31);
		WicketKeeper c6=new WicketKeeper("MAHENDRASINGH DHONI",7);
		Batsman c7=new Batsman("SHUBHMAN GILL",77);
		PlayerManagment a=new PlayerManagment();
		a.addPlayer(b1);
		a.addPlayer(b2);
		a.addPlayer(b3);
		a.addPlayer(b4);
		a.addPlayer(b5);
		a.addPlayer(c1);
		a.addPlayer(c2);
		a.addPlayer(c3);
		a.addPlayer(c4);
		a.addPlayer(c5);
		a.addPlayer(c6);
		System.out.println("*********************  INDIA CRICKET TEAM  ************************");
//		for(Player player:a.bowler) {
//			System.out.println("bowler name is: "+player.name+ " and its jerseyNo is: "+player.jerseyNo);
//			player.roll();
//		}
//		for(Player player:a.batsman) {
//			System.out.println("batsman name is: "+player.name+ " and its jerseyNo is: "+player.jerseyNo);
//			player.roll();
//		}
		a.removePlayer(c3);
		a.addPlayer(c7);
		for(Player player:a.bowler) {
			System.out.println("bowler name is: "+player.name+ " and its jerseyNo is: "+player.jerseyNo);
			player.roll();
		}
		for(Player player:a.batsman) {
			System.out.println("batsman name is: "+player.name+ " and its jerseyNo is: "+player.jerseyNo);
			player.roll();
		}
		
		
	}

}
