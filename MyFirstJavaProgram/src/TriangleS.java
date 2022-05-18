//Data types and variables
//2. Print the area of a triangle by given sides. Use formula to calculate it.
//Use Heron's formula

public class TriangleS {

	public static void main(String[] args) {
		double a = 2;
		double b = 3;
		double c = 4;
		double p = 0.5 * (a + b + c);
		double s = p * (p - a) * (p - b) * (p - c);
		double s1 = Math.sqrt(s);
		System.out.println("S = " + s1);
		
	}

}
