/*
 *	Author: Joshua Won
 *  Date: 11/5/24
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int[] bythree = new int[1001];
		int josh = 0;
		int won = josh + 1;
		while (josh < 1000){
			int poole = 3 * won;
			bythree[won] = poole;
			System.out.println("Count " + won + " has the value of "+ bythree[josh]);
			josh++;
		}
		int[] byone = new int[1001];
		int count = 0;
		while (count < 1000){
			int output = 1000 - count;
			byone[count] = output;
			System.out.println("count " + count + " has the value of " + byone[count]);
			count++;
		}
	}
}
