/*
 *	Author: Joshua Won
 *  Date: 9/18/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter what day it is (0-6): ");
		int joshua = sc.nextInt();
		
		if (joshua == 0 || joshua == 6 ) {
		System.out.print("It's the weekend! Wake up at 10:00 am!");
		}	
		
		else if (joshua > 6 || joshua < 0 ){
		System.out.print("Your input is something not valid!");
		}	
		
		else {
		System.out.print("It's the weekday! Wake up at 7:00 am!");
		}
	}
}
