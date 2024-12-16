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
	
	
	System.out.print("Please enter a temperature in Fahrenheit: ");
	double number = sc.nextInt();
	sc.nextLine();
	
	
	System.out.println(number + "from Fahrenheit to Celsius is: " + ((number -32)*5/9));
	
	
	
	
	}
}
