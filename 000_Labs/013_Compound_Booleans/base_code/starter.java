/*
 *	Author: Joshua Won
 *  Date: 9/19/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int joshua = sc.nextInt();
		
		System.out.print("Please enter your second number: ");
		int poole = sc.nextInt();
		
		System.out.print("Please enter your third number: ");
		int won = sc.nextInt();
		
		if (joshua > poole && joshua > won){ 
			System.out.println("Your first number was the largest of the three!");
			System.out.println("The number was " + joshua + ".");
		
		}
		else if (poole > joshua && poole > won){
			System.out.println("Your second number was the largest of the three!");
			System.out.print("The number was " + poole + ".");
		}
		
		else if (won > joshua && won > poole){
			System.out.println("Your third number was the largest of the three!");
			System.out.println("The number was " + won + ".");
		}
		
		if (joshua < poole && joshua < won){ 
			System.out.println("Your first number was the smallest of the three!");
			System.out.println("The number was " + joshua + ".");
		
		}
		else if (poole < joshua && poole < won){
			System.out.println("Your second number was the smallest of the three!");
			System.out.println("The number was " + poole + ".");
		}
		
		else if (won < joshua && won < poole){
			System.out.println("Your third number was the smallest of the three!");
			System.out.println("The number was " + won + ".");
		}
		
	}
	
}
