/*
 *	Author:  Joshua Won
 *  Date: 10/18/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
	Scanner sc = new Scanner(System.in);
		BaseClass class1 = new BaseClass("no Role");
		class1.giverolestats();
		
		System.out.println("What class would you like to be");
		String role = sc.nextLine();
		if(role.equals("Warrior")||(role.equals("Wizard")||(role.equals("Rogue")))){
			BaseClass class2 = new BaseClass(role);
			class2.giverolestats();
		}
		else {
			System.out.println("You've decided not to choose a role. Rerun program");
			role = new String("no Role");
			BaseClass class2 = new BaseClass(role);
			class2.giverolestats();
		}

		
	}
}
