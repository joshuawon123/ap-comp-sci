/*
 *	Author:  Joshua Won
 *  Date: 9/23/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name?: ");
		String joshua = sc.nextLine();
		
		System.out.print("What is your title ? Ex: Slayer of Dragons: ");
		String title = sc.nextLine();
		
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue?: ");
		String poole = sc.nextLine();
		
		if (poole.equals("Wizard") || poole.equals("wizard")){
			System.out.println("You've chosen to be a Wizard! Excelsior!");
		}
		else if (poole.equals("Warrior") || poole.equals("warrior")){
			System.out.println("You've chosen a Warrior! For honor!");
		}
		else if (poole.equals("Rogue") || poole.equals("rogue")){
			System.out.println("You've chosen to be a Rogue. How cunning!");
			}
		else {
			System.out.println("That is not an option");
		}
		
		System.out.println("You have 20 points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely");
		
		System.out.print("Strength (1-10): ");
		int won = sc.nextInt();
		if (won >= 0 && won <= 10){
			
			System.out.println("You have " + (20 - won) + " left to spend.");
		}
		else if (won < 0 || won >= 11){
			System.out.print("Your number is not in the range of (1-10). Try again: ");
			won = sc.nextInt();
			System.out.println("You have " + (20 - won) + " left to spend");
		}
		
		
		System.out.print("Dexterity (1-10): ");
		int val = sc.nextInt();
		if (val >= 0 && val <= 10){
			
			System.out.println("You have " + (20 - won - val) + " left to spend.");
		}
		else if (val < 0 || val > 11){
			System.out.print("Your number is not in the range of (1-10). Try again: ");
			val = sc.nextInt();
			System.out.println("You have " + (20 - won - val) + " left to spend");
		}
		
		System.out.print("Intelligence (1-10): ");
		int ryan = sc.nextInt();
		if (ryan >= 0 && ryan <= 10){
			
			System.out.println("You have " + (20 - won - val - ryan) + " left to spend.");
		}
		else if (ryan < 0 || ryan >= 11){
			System.out.print("Your number is not in the range of (1-10). Try again: ");
			ryan = sc.nextInt();
			System.out.println("You have " + (20 - won - val - ryan) + " left to spend");
		}
		
		System.out.print("Charisma (1-10): ");
		int lee = sc.nextInt();
		
		
		if (20 - won - val - ryan > 0) {
			System.out.println("You have " + (20 - won - val - ryan - lee) + " to spend for next time.");
		}
		
		System.out.println(" ");
		System.out.println("You are " + joshua + ", the " + title + " of CVHS.");
		System.out.println("You're a " + poole + " with the following stats!");
		System.out.println("Strength - " + won);
		System.out.println("Dexterity - " + val);
		System.out.println("Intelligence - " + ryan);
		System.out.println("Charisma - " + lee);
		
		System.out.print("Goodluck on your quest " + joshua + "!");
		
	}
}
