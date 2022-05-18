//Control flow statements
//Given a list iterate it and display numbers which are divisible by 5 and 
//if you find number greater than 150 stop the loop
//iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200]

public class NumbersDiv5 {

	public static void main(String[] args) {
		int arr[] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
		for (int i = 0; i < arr.length; i++)
		if(arr[i] % 5 == 0 && arr[i] <= 150) {
			System.out.println("Numbers divisible by 5 are: " + arr[i]);
		}

	} 
}