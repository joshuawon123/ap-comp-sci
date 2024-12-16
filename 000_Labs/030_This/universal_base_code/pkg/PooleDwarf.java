/*
 *	Author: Joshua Won
 *  Date: 11/1/24 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		this.name = name;
		this.age = age;
		// Complete this constructor
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		this.name = name;
		// Fix this method
	}
	
	public void setAge(int age){
		this.age = age;
		// Fix this method
	}

	public boolean isSameName(String name){
		return this.name == name;
		// Complete this method
	}
}

