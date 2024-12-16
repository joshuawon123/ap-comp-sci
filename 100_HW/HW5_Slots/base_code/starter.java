/*
 *	Author: Joshua Won
 *  Date: 10/6/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Slot Machine Rules: ");
		System.out.println("1. Each player starts with $100. ");
		System.out.println("2. Input a wager less than your total amount of money. ");
		System.out.println("3. The slot will roll numbers from 1 to 10.");
		System.out.println("   a. If the numbers match , you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		
		Scanner sc = new Scanner(System.in);
		int money = 100;
		int bet;
		
		while (money > 0){
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
			String response = sc.nextLine();
			
			if (response.equals("Yes")|| response.equals("yes")|| response.equals("Y")||response.equals("y")){
				System.out.println("You have $" + money + ". How much would you like to wager? ");
				while (money >0){
					bet = sc.nextInt();
					sc.nextLine();
					
					if (money == 0){
						System.out.println("You've run out of money! Thanks for coming! Come back soon!");
						break;
					}
					else if (bet > money){
						System.out.println("You only have $" + money + "! Please enter a smaller number: ");
					}
					else if (bet <= 0){
						System.out.println("Sneaky! No negatives or 0! Try again: ");
					}
					else{
						System.out.println("Great! Lets play!!!\nYour rolls are:\n");
						money = money - bet;
						int slot1 = ((int)(Math.random()*10)+1);
						int slot2 = ((int)(Math.random()*10)+1);
						int slot3 = ((int)(Math.random()*10)+1);
						System.out.println("______________________");
						System.out.println(" | " + slot1 + " | " + slot2 + " | " + slot3 + " |");
						System.out.println("______________________");
						if(slot1 != slot2 && slot1 != slot3 && slot2 != slot3){
							System.out.println("Didn't win this time, better luck next time!");
							System.out.println("You have " + money + ".");
							break;
						}
						else if (slot1 == slot2 && slot1 ==slot3){
							System.out.println("JACKPOT! You're wager has now been tripled!");
							money = money + bet * 3;
							System.out.println("You now have $" + money + ".");
							break;
						}
						else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot1 || slot2 == slot3 || slot3 == slot1 || slot3 == slot2){
							System.out.println("You won! You're wager has now been doubled!");
							money = money + bet * 2;
							System.out.println("You now have $" + money  + ".");
							break;
						}
					}
				}
			}
			else if (response.equals("No")|| response.equals("no")|| response.equals("N")|| response.equals("n")){
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			}
			else {
				System.out.println("That wasn't quite the correct answer. Try again.\n-------------------------------------------------\n");
			}
		}
	}
}
