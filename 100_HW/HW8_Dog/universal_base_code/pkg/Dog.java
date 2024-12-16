package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		String name;
		int age;
		String breed;
	public Dog() {
		name = new String("Clifford"); 
		age = 3;
		breed = new String("big red dog");
	}
	public Dog(String n){
		name = n;
		age = 1;
		breed = new String("dog dog");
	}
	public Dog(String n, String b){
		name = n;
		breed = b;
		age = 1;
	}
	public Dog(String n, int a){
		name = n;
		age = a;
		breed = new String("dog dog");
	}
	public void setName(String a){
		name = a;
		return;
	}
	public void setAge(int a){
		age = a;
		return;
	}
	public void setBreed(String a){
		breed = a;
		return;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int rand = (int)(Math.random()*2);
		if (rand == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " goes bark!");
		return;
	}
}
