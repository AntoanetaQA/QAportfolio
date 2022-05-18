//3. Write a Java method to display the middle character of a string.
//Note:
//a) If the length of the string is even there will be two middle characters.
//b) If the length of the string is odd there will be one middle character.


public class MiddleCharacter {

	public static void main(String[] args) {
	String middle = printMiddleCharacter("You are Bulgarian");	
	System.out.println(middle);
	
	String middle1 = printMiddleCharacter("Italy");	
	System.out.println(middle1);
	
	String middle2 = printMiddleCharacter("12345");	
	System.out.println(middle2);
	
	}

	public static String printMiddleCharacter(String value) {
		int length = value.length();
		int middle;
		
		if(length % 2 == 0) {
			middle = value.length() / 2 - 1;
			length = 2;
		} else {
			middle = value.length() / 2;
			length = 1;
		}
		return value.substring(middle, middle + length);
	}
	
}

