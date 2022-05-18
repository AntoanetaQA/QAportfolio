public class Sum {

	public static void main(String[] args) {
		double sum = calculateSum (2.5, 8, -1.5);
		System.out.println(sum);
	}
	public static double calculateSum(double x, double y, double z) {
		double sum = x + y + z;
		return sum;
	}
}
