/*
 *	Author: Joshua Won
 *  Date: 10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		Employee joshua = new Employee(1011, "Joshua", "Won", 10000);
		joshua.employeeToString();
		
		System.out.println("Annual Salaries of All the Employees and Salary: ");
		joshua.raiseSalary(25);
		System.out.println("joshua $: " + joshua.getAnnualSalary() + ", " + joshua.getSalary());
		jim.raiseSalary(10);
		System.out.println("jim $: " + jim.getAnnualSalary() + ", " + jim.getSalary());
		pam.raiseSalary(5);
		System.out.println("pam $: " + pam.getAnnualSalary() + ", " + pam.getSalary());
		dwight.raiseSalary(15);
		System.out.println("dwight $: " + dwight.getAnnualSalary() + ", " + dwight.getSalary());
		michael.raiseSalary(20);
		System.out.println("michael $: " + michael.getAnnualSalary() + ", " + michael.getSalary());
		
		


	}
	
}
