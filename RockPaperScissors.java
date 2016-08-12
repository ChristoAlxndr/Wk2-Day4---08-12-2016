package com.assignment;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		String userInput = null;
		String userName = null;
		boolean playOn = true;
		Users opponent = null;
		int choice = 0;
		
		JohnOpponent John = new JohnOpponent();
		AshleyOpponent Ashley = new AshleyOpponent();
		DavidOpponent David = new DavidOpponent();
		Human Operator = new Human();
		
		Scanner sc = new Scanner(System.in);
		
		while (playOn) {
		System.out.println("Rock, Paper, Scissors Battle");
		System.out.println("Enter your name.");
		userName = sc.nextLine();
		
		System.out.println("\n\n Please select an opponent: \n"
				+ "(J)ohn, (A)shley, (D)avid");
		userInput = sc.nextLine();		

		
		do {	
			switch (userInput.toLowerCase()) {
				case "j":
					opponent = John;
					System.out.println(userName + " has chosen to face-off with " + opponent.getName() + "!!! \n\n");
					throwDown(Operator.choice(), John.choice());
					break;
			
				case "a":
					opponent = Ashley;
					System.out.println(userName + " has chosen to face-off with " + opponent.getName() + "!!! \n\n");
					throwDown(Operator.choice(), Ashley.choice());					
					break;
			
				case "d":
					opponent = David;
					System.out.println(userName + " has chosen to face-off with " + opponent.getName() + "!!! \n\n");
					throwDown(Operator.choice(), David.choice());					
					break;
					
				case "x":
					playOn = false;
					endGame();
					break;
			
				default:
					System.out.println("You have made an invalid choice.  Please enter 'J', 'A', or 'D' to choose an opponent.");
					break;		
					
		} System.out.println("\n\n Let's throw again!");
		
		System.out.println("\n\n Please select an opponent: \n"
				+ "(J)ohn, (A)shley, (D)avid or E(x)it");
		userInput = sc.nextLine();		
		
		} 	while (!(userInput.equals(John) && userInput.equals(Ashley) && userInput.equals(David)));	
		} // While Close
		
	} //Main Close

	public static void throwDown(String operator, String opponent) {
		
		if (operator.equals(opponent)) {
			System.out.println("It's a tie!!!");
		} else if (operator.equals("Rock") && (opponent.equals ("Paper"))) {
			System.out.println("Paper COVERS rock! \n "
					+ "YOU LOSE!!!");
		} else if (operator.equals("Rock") && (opponent.equals ("Scissors"))) {
			System.out.println("Rock DULLS scissors! \n "
					+ "YOU WIN!!!");
		} else if (operator.equals("Paper") && (opponent.equals("Rock"))) {
			System.out.println("Paper COVERS rock! \n"
					+ "YOU WIN!!!");
		}else if (operator.equals("Paper") && (opponent.equals("Scissors"))) {
			System.out.println("Scissors CUT paper! \n"
					+ "YOU LOSE!!!");
		} else if (operator.equals("Scissors") && (opponent.equals("Rock"))) {
			System.out.println("Rock DULLS scissors! \n"
					+ "YOU LOSE!!!");
		} else if (operator.equals("Scissors") && (opponent.equals("Paper"))) {
			System.out.println("Scissors CUT paper! \n"
					+ "YOU WIN!!!"); 
		}
	}
		
		public static boolean endGame() {
			System.out.println("Thank you for playing.");
			System.exit(0);
			return false;
	}
	
} //Class Close
