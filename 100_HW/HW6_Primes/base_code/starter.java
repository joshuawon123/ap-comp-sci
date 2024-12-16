/*
 *	Author: Joshua Won
 *  Date: 10/13/24
*/

import java.util.Scanner;

class starter {
	
	public static boolean checkPrime(int josh){
		int poole = josh - 1;
		while (poole > 1){
			if ((josh%poole) == 0){
				return false;
			}
			poole--;
		}
		return true;
	
	}
	
	public static void printPrimes(int won){
		while(won > 1){
			if (checkPrime(won) == true){
				System.out.println(won);
			}
			else {
				System.out.print("");
			}
			won--;
		}
	}
	
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int answer = sc.nextInt();
		printPrimes(answer);
	}
}
