/*
 *	Author:  Joshua Won
 *  Date: 10/25/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
        myCharacter joshua = new myCharacter("no role.");
        joshua.myToString();

        System.out.println("what do you want to become?: ");
        String role1 = sc.nextLine();
        myCharacter won = new myCharacter(role1);
        if(won.setAll(role1, 10,10,10,10)){
            won.myToString();
        }
        else{
            System.out.println("it is not greater than 0.");
        }

	}
}
