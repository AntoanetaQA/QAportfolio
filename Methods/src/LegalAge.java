public class LegalAge {

	public static void main(String[] args) {
		String legalMessage = legalAge(101);
		System.out.println(legalMessage);
		
		String legalMessage1 = legalAge(8);
		System.out.println(legalMessage1);
	}
	
	public static String legalAge (int age) {
		if(age >= 18) {
			return "This person is adult.";
		} else {
			return "This person is under age.";
		}
	}
}
