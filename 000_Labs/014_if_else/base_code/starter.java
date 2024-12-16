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
		System.out.print("Pick a number between 1-1000: ");
		int joshua = sc.nextInt();
		
		int x = ((int)(Math.random() * 999));
	
		
		if (joshua == x){
			System.out.println("You picked the right number. The number was " + x);
		}
		else {
			System.out.print("Your number wasn't the right number. The number was " + x + ".");
		}
	}
}
