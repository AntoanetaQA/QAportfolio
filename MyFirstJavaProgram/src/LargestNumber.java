//Control flow statements
//4. Find the largest number in an array

public class LargestNumber {
	
	public static void main(String[] args) {
	int arr[] = {5, 0, -3, 25, 5, 98, 26};
	int i = 0;
	int largestNumber = arr[0];
	
 	for(i = 0; i < arr.length; i++) {
 		if(arr[i] >= largestNumber) {
 		largestNumber = arr[i];
 		}
	}
 	System.out.println(largestNumber);
 	
	}
}	
	
