/*
 *	Author:  Joshua Won
 *  Date: 9/18
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your first integer: ");
		int joshua = sc.nextInt();
		
		System.out.print("Enter your second integer: ");
		int won = sc.nextInt();
		
		
		if (joshua == won) {
			System.out.print("The variables are the same");
		}
		
		else {
			System.out.print("The variables are different");
		}
	}
}
