//Write a Java method to compute the average of three numbers.

public class AverageNumber {

	public static void main(String[] args) {
		double number = averageNumber(2, 8, 10);
		System.out.println(number);
	}
	
		public static double averageNumber(double a, double b, double c) {
			double averageNumber = (a + b + c)/3;
			return averageNumber;
		}
	}
