package com.assignment;

import java.util.Scanner;

public class Human extends Users {
	
	Scanner sc = new Scanner(System.in);
	protected boolean userError = false;
	
	String[] rockPaperScissors = new String [] {"Rock", "Paper", "Scissors"};
	
	String choice = null;
	
	public Human(String name, String gender, boolean userError) {
		super(name, gender);
		this.userError = userError;
	}
	
	public Human() {
	}

	public boolean isUserError() {
		return userError;
	}

	public void setUserError(boolean userError) {
		this.userError = userError;
	}
	

	public static boolean numberVal(String userInput) {
		
		if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3")) {
				int number = Integer.parseInt(userInput);
				return false;
			} else
				return true;
	}

	@Override
	public String choice() {
		
		do {
		System.out.println("Make your play! \n"
				+ "(1) Rock \n"
				+ "(2) Paper \n"
				+ "(3) Scissors \n");
		
		choice = sc.next();
		userError = numberVal(choice);
		
		} while (userError);
			
		int number = Integer.parseInt(choice);
		String choice = rockPaperScissors[number -1];
		System.out.println("Player throws " + choice);
		return choice;
	}
}
