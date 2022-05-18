//Control flow statements
//2. Write Java program to allow the user to input his/her age. 
//Then the program will show if the person is eligible to work. 
//A person who is eligible to work must be older than or equal to 16 years old.

import java.util.Scanner;

public class EligibleToWork {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		if(age >= 16) {
			System.out.println("You are eligible to work.");
		} 
		else {
			System.out.println("You are not eligible to work.");
		}
	}

}
