package com.assignment;

import java.util.Random;

public class AshleyOpponent extends Users {
	
	String name = "Ashley";
	
	String[] rockPaperScissors = new String [] {"Rock", "Paper", "Scissors"};

	public AshleyOpponent() {
		super("Ashley", "Female");
		// TODO Auto-generated constructor stub
	}

	public AshleyOpponent(String name, String gender) {
		super(name, gender);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String choice() {	
		String choice = (rockPaperScissors[new Random().nextInt(rockPaperScissors.length)]);
		System.out.println("Ashley throws " + choice);
		return choice;
	}

	@Override
	public void numberVal() {
		// TODO Auto-generated method stub
		
	}

}
