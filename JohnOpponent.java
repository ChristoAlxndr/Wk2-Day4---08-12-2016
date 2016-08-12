package com.assignment;

import java.util.Random;

public class JohnOpponent extends Users {
	
	
	String[] rockPaperScissors = new String [] {"Rock", "Paper", "Scissors"};
	

	public JohnOpponent() {
		super("John", "male");
		
	}

	public JohnOpponent(String name, String gender) {
		super(name, gender);
		
		
	}
	
	@Override
	public String choice() {
		String choice = (rockPaperScissors[new Random().nextInt(rockPaperScissors.length)]);
		System.out.println("John throws " + choice);
		return choice;
		
	}

	@Override
	public void numberVal() {
		// TODO Auto-generated method stub
		
	}

}
