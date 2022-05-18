//Data types and variables
//5. Using Java input and fine tune print the perimeter and area 
//of a triangle by given sides.

import java.util.Scanner;

public class TriangleInput {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side a: ");
		double a = sc.nextDouble();
		System.out.println("Enter side b: ");
		double b = sc.nextDouble();
		System.out.println("Enter side c: ");
		double c = sc.nextDouble();
		double p = a + b + c;
		double p1 = 0.5 * (a + b + c);
		double s = p1 * (p1 - a) * (p1 - b) * (p1 - c);
		double s1 = Math.sqrt(s);
		System.out.println("P = " + p);
		System.out.println("S = " + s1);

	}
}
