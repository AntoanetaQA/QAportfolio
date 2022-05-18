//1. Write a Java method to find the smallest number among three numbers.

public class SmallestNumber {

	public static void main(String[] args) {
	int number = smallestNumber(5, -283, 307);
	System.out.println(number);
	
	int number1 = smallestNumber(-3, 1818, 0);
	System.out.println(number1);
	
	int number2 = smallestNumber(102, 888, 7);
	System.out.println(number2);
	
	int number3 = smallestNumber(16, 1, 1);
	System.out.println(number3);
	
	}

	public static int smallestNumber(int a, int b, int c) {
		int smallestNumber = 0;
		
		if(a <= b && a <= c) {
			smallestNumber = a;
		}
		if(b <= a && b <= c) {
			smallestNumber = b;
		}
		if(c <= a && c <= b) {
			smallestNumber = c;
		}
		return smallestNumber;
	}
}
