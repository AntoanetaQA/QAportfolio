
public class SumArray {
	
	public static void main(String[] args) {
		double [] inputArr = {5, 4.5, -1.2, 0, 8000};
		double sum = sumArray(inputArr);
		System.out.println(sum);
	}
	public static double sumArray(double[] digits) {
		double sum = 0;
		for(int i = 0; i < digits.length; i++) {
			sum = sum + digits[i];
		}
		return sum;
	}
}


