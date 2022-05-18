//Operators, expressions and statements in Java.
//2. Check if the user can drive.
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Has valid driving licence? Options are True or False: ");
		boolean hasValidLicence = sc1.nextBoolean();
		
		System.out.println(age);
		System.out.println(hasValidLicence);
		if(age >= 18 && hasValidLicence == true) {
			System.out.println("The user can drive!");
		} else {
			System.out.println("The user cannnot drive!");
		}
	}

}
