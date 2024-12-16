/*
 *	Author: Joshua Won
 *  Date: 11/10/24
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
	int [] arr = new int [20];
	System.out.println("----------------------------------------------------");
	for(int i = 0; i < arr.length; i++){
	arr[i] = (int)(Math.random()*10)+1;
	System.out.print(arr[i] + " ");
	}
	System.out.println("");
	System.out.println("----------------------------------------------------");

	int randomnum = arr[(int)(Math.random()*20)+1];
	int storage = 0; 
	System.out.println("The random number to look for is " + randomnum);
	for(int i = 0; i < arr.length; i++){
		if(randomnum == arr[i]){
		storage++;
		System.out.println("Duplicate found at index " + i);
		}
	}
	if(storage == 0){
	System.out.println("The total number of duplicates for " + randomnum + " is " + storage);
	}
	System.out.println("The total number of duplicates for " + randomnum + " is " + storage);
	System.out.println("----------------------------------------------------");

	System.out.println("Looking for two in a row:");
	for(int i = 1; i < arr.length; i++){
		if(arr[i] == arr[i-1]){
		System.out.println("Two in a row found at indexes " + (i-1) + " and " + i + ". The number is " + arr[i]);
			}
		}
	}
}
