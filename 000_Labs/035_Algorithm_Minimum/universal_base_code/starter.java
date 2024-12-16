/*
 *	Author:  Joshua Won
 *  Date: 11/7/24
 */

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int c = 0;
		int random= (int)(Math.random()*150)+51;
    	int []arr = new int[random];
    	int len = arr.length;
    	int sum= 0;
		int min = Integer.MAX_VALUE;
    	int max= Integer.MIN_VALUE;
		 for(int i = 0; i<arr.length; i++){
        arr[i] = (int)(Math.random()*100)+1;

    }
    for(int i = 0; i<len; i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    for(int i = 0; i<len; i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    for(int i = 0; i<arr.length; i++){
        sum+=arr[i];

        }
    while(c<len){
        System.out.print(arr[c]+", ");
        c++;
    }

     System.out.println(" ");
     System.out.println("Minimum value is "+min);
     System.out.println("Maximum is "+max);
     System.out.print("Average is "+sum/random);

		
	}
}
