/*
 *	Author: Joshua Won
 *  Date: 10/18/24
*/
package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	
		int dexterity;
		int strength;
		int intelligence;
		int constitution;
		int charisma;
		String role; 
	
	public BaseClass(String joshua){
		role = joshua;
		strength = 0;
		dexterity = 0;
		constitution = 0;
		charisma = 0;
		
	}
	public void giverolestats(){
		System.out.print("------------------------------");
		System.out.println("Your role is " + role );
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexteriy trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your constitution trait is " + constitution);
		System.out.println("Your charisma trait is " + charisma);
		System.out.println("------------------------------");
		System.out.println("");
	}
}

