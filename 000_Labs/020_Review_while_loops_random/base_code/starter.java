/*
 *	Author:  Joshua Won
 *  Date: 10/3/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int guess = 0;
	int secret = (int)(Math.random()*999)+1;
	
	boolean correctanswer = false;
	
	Scanner sc = new Scanner(System.in);
	while (correctanswer == false){
		System.out.print("Guess a number: ");
		guess = sc.nextInt();
		
		if (guess == secret){
			System.out.print("You guessed it!");
			correctanswer = true;
			
		}
		else if (guess > secret) {
			System.out.println("Your number is a lil too high!");
		}
		else if (guess < secret) {
			System.out.println("Your number is a lil too low!");
		}
		
	}

		
	}
}
