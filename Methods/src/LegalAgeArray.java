public class LegalAgeArray {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
		System.out.println("Age " + i + ": " + legalAge(i));
		}	
	}
		
	public static String legalAge (int age) {
		if(age >= 18) {
			return "This person is adult.";
		} else {
			return "This person is under age.";
		}
	}
}
