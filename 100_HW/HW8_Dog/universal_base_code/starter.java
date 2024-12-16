/*
 *	Author: Joshua Won
 *  Date: 10/27/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog cookie = new Dog("Cookie");
		cookie.setAge(20);
		Dog francis = new Dog("Francis", "Golden Retriever");
		
		if(cookie.isSleeping()){
			System.out.println(cookie.getName() + " is asleep!");
		}
		else{
			cookie.bark();
			francis.bark();
			
		}



	}
}
