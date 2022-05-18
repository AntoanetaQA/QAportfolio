//Operators, expressions and statements in Java.
//1. Write a program which calculates if a triangle can be built by 3 given angles.
//The angles are taken from the user input. There are two possible outputs - if
//the triangle can't be build based on the angle values or the triangle can be
//built based on the angle values. If the triangle is possible the output should 
//contain also the type of the triangle - acute, right-angled, obtuse, 
//equilateral, isosceles, multifaceted.
//Use logical and comparison operators and if statements.

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle 1: ");
		int angle1 = sc.nextInt();
		if(angle1 > 0 && angle1 < 180) {
			System.out.println("Angle 1 = " + angle1);
		} else {
			System.out.println("Invalid value! Angle value must be: 0 < angle < 180!");
		}
		System.out.println("Enter angle 2: ");
		int angle2 = sc.nextInt();
		System.out.println("Enter angle 2: ");
		if(angle2 > 0 && angle2 < 180) {
			System.out.println("Angle 2 = " + angle2);
		} else {
			System.out.println("Invalid value! Angle value must be: 0 < angle < 180!");
		}
		System.out.println("Enter angle 3: ");
		int angle3 = sc.nextInt();
		if(angle3 > 0 && angle3 < 180) {
			System.out.println("Angle 3 = " + angle3);
		} else {
			System.out.println("Invalid value! Angle value must be: 0 < angle < 180!");
		}
		
		int sum = angle1 + angle2 + angle3;
		if(sum == 180 && angle1 > 0 && angle1 < 180 && angle2 > 0 && angle2 < 180 && angle3 > 0 && angle3 < 180) {
		System.out.println("Sum = " + sum);
		System.out.println("The triangle can be built.");	
			if(angle1 < 90 && angle2 < 90 && angle3 < 90) {
			System.out.println("The triangle is acute.");
		  } if(angle1 == 90 || angle2 == 90 || angle3 == 90) {
			System.out.println("The triangle is right-angled.");
		  } if(angle1 > 90 || angle2 > 90 || angle3 > 90) {
			System.out.println("The triangle is obtuse.");
		  } if(angle1 == 60 && angle2 == 60 && angle3 == 60) {
			System.out.println("The is equilateral.");
		  } if((angle1 != 60 && angle2 != 60 && angle3 != 60) && (angle1 == angle2 || angle2 == angle3 || angle1 == angle3)) {
			System.out.println("The triangle is isosceles.");
		  } if(angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
			System.out.println("The triangle is multifaceted.");
		  }
		 } else {
				System.out.println("Sum = " + sum);
				System.out.println("The triangle cannot be built.");	
	 		}
		}
	}

