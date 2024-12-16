/*
 *	Author: Joshua Won
 *  Date: 9/28/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter an integer: ");
		int joshua = sc.nextInt();
		
		System.out.print("Please enter another integer: ");
		int won = sc.nextInt();
		
		if (joshua % 2 == 0){
			System.out.println("Your first number is even");
		}
		else {
			System.out.println("Your first number is odd");
		}
		
		if (won % 2 == 0){
			System.out.println("Your second number is even");
		}
		else {
			System.out.println("Your second number is odd");
		}
		
		boolean one = joshua % 3 == 0;
		boolean two = won % 4 == 0;
		boolean three = joshua % 5 == 0;
		
		if (one == true){
			System.out.println(joshua + " divisible by 3");
			
		}
		else {
			System.out.println(joshua + " is not divisible by 3");
		}
		if (two == true){
			System.out.println(joshua + " is divisible by 4");
			
		}
		else {
			System.out.println(joshua + " is not divisible by 4");
		}
		if (three == true){
			System.out.println(joshua + " is divisible by 5");
			
		}
		else {
			System.out.println(joshua + " is not divisible by 5");
		}
		
		
		if (one == true){
			System.out.println(won + " divisible by 3");
			
		}
		else {
			System.out.println(won + " is not divisible by 3");
		}
		if (two == true){
			System.out.println(won + " is divisible by 4");
			
		}
		else {
			System.out.println(won + " is not divisible by 4");
		}
		if (three == true){
			System.out.println(won + " is divisible by 5");
			
		}
		else {
			System.out.println(won + " is not divisible by 5");
		}
	}
}
