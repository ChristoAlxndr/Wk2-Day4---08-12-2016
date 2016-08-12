package com.assignment;

import java.util.Random;

public class DavidOpponent extends Users {
	
	String name = "David";
	
	String[] rockPaperScissors = new String [] {"Rock", "Paper", "Scissors"};

	public DavidOpponent() {
		super("David", "male");
		// TODO Auto-generated constructor stub
	}

	public DavidOpponent(String name, String gender) {
		super(name, gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String choice() {
		String choice = (rockPaperScissors[new Random().nextInt(rockPaperScissors.length -2)]);
		System.out.println("David throws " + choice);
		return choice;
	}

	@Override
	public void numberVal() {
		// TODO Auto-generated method stub
		
	}
	
}
