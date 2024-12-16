/*
 *	Author: Joshua Won	
 *  Date: 12/6/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence. ");
		String josh = sc.nextLine();
		String storage = "";
		
		while(true){
			if(josh.indexOf(" ") == -1){
				System.out.print(josh + " ");
				break;
			}
			int space = josh.indexOf(" ");
			String word = josh.substring(0, space);
			storage = word + " " + storage;
			josh = josh.substring(space + 1);
		}
		System.out.print(storage);


		
	}
}
