/*
	Author: Joshua Won
	Date: 10/28/24
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman tobey = new Spiderman("Tobey Maguire", 49, "Green Goblin");
		Spiderman andrew = new Spiderman("Andrew Garfield", 41, "Electro");
		Spiderman tom = new Spiderman("Tom Holland", 28, "The Vulture");
		Spiderman joshua = new Spiderman("Joshua Won", 16, "School");
		
		tobey.fight();
		andrew.fight();
		tom.fight();
		joshua.fight();
		andrew.printArt();
	}
}
