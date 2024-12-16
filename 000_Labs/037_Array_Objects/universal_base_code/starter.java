/*
 *	Author: Joshua Won
 *  Date: 11/15/24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Wizard [] wiz = new Wizard [100];
	Warrior [] war = new Warrior [100];
	
	for(int i = 0; i < war.length; i++){
		wiz[i]= new Wizard();
	}
	for(int i = 0; i < war.length; i++){
	 	war[i]= new Warrior();
	}
	int deadwizard = 0;
    int deadwarrior = 0;
    
    while (deadwizard < 100 && deadwarrior < 100){
    	wiz[deadwizard].attack(war[deadwarrior]);
    	if(war[deadwarrior].isDead()){
    		deadwarrior++;
    	}
    	if (deadwizard > 99 || deadwarrior > 99){
    		break;
    	}
    
    }
    if (deadwizard < deadwarrior){
    	System.out.print("The wizards have won with " + (100 - deadwizard) + " remaining");
    }
    else{
    	System.out.print("The warriors have won with " + (100 - deadwarrior) + " remaining");
    }
	}
}
