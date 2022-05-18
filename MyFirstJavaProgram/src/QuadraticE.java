//Data types and variables
//6. Write a simple program, without checks to print the result of quadratic equation.

public class QuadraticE {
	
	public static void main(String[] args) {
		
	System.out.println("a*x*x + b*x + c = 0");	
		int a = 1;
		System.out.println("a = " + a);
		int b = 7;
		System.out.println("b = " + b);
		int c = 11;
		System.out.println("c = " + c);
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c))/2 * a;
		double x2 = (-b - Math.sqrt(b * b - 4 * a * c))/2 * a;
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

	}
}