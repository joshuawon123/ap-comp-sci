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
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue?: ");
		String joshua = sc.nextLine();
		
		if (joshua.equals("Wizard") || joshua.equals("wizard")){
			System.out.println("You've chosen to be a Wizard! Excelsior!");
		}
		else if (joshua.equals("Warrior") || joshua.equals("warrior")){
			System.out.println("You've chosen a Warrior! For honor!");
		}
		else {
			System.out.println("You've chosen to be a Rogue. How cunning!");
			}
		
		}
	}
