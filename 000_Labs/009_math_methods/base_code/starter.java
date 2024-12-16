/*
 *	Author:  Joshua Won
 *  Date: 9/11/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a double: ");
		double number = sc.nextDouble();
		
		System.out.println("Please enter another double: ");
		double number2 = sc.nextDouble();
		
		System.out.println("Maximum number of x and y is: " + Math.max(number, number2));
		
		System.out.println("Square root of y is: " + Math.sqrt(number2));
		
		System.out.println("Power of x is: " + Math.pow(number,number2));
	}
}
