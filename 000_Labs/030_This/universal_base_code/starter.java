/*
 *	Author: Joshua Won
 *  Date: 11/1/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf joshua1 = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf joshua2 = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf joshua3 = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf joshua4 = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf joshua5 = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf joshua6 = new PooleDwarf(randName(), (int)(Math.random()*7));
		PooleDwarf joshua7 = new PooleDwarf(randName(), (int)(Math.random()*7));
		
		int counter =0;
		
		if(joshua1.isSameName(joshua2.getName())){
			counter++;
			
		}
		if(joshua1.isSameName(joshua3.getName())){
			counter++;
			
		}
		if(joshua1.isSameName(joshua4.getName())){
			counter++;
			
		}
		if(joshua1.isSameName(joshua5.getName())){
			counter++;
			
		}
		if(joshua1.isSameName(joshua6.getName())){
			counter++;
			
		}
		if(joshua1.isSameName(joshua7.getName())){
			counter++;
			
		}
		System.out.println(counter);
		System.out.println(joshua1.getName());
		System.out.println("Dwarf 1 was duplicated: " + counter + " times, and the name was: " + joshua1.getName());
	}
}
