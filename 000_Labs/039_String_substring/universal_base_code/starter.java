/*
 *	Author: Joshua Won
 *  Date: 11/22/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a word");
		String name = sc.nextLine();
		
		for(int i = 0; i < name.length(); i++){
			System.out.println(i + " " + name.substring(i, i + 1));
		}


		
	}
}
