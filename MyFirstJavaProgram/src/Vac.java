
	import java.util.Scanner;

	public class Vac {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter type of the vacation: Beach or Mountain");
			String type = sc.nextLine();
			System.out.println("Enter your budget: ");	
			double budget = sc.nextDouble();
			
			if(type.equals("Beach") && budget < 50) {	
			System.out.println("Bulgaria is the perfect destination for your beach vacation!");	
			}
			else if(type.equals("Beach") && budget >= 50) {	
				System.out.println("You can choose destination outside Bulgaria for your beach vacation!");	
				}
			else if(type.equals("Mountain") && budget < 30) {	
				System.out.println("Bulgaria is the perfect destination for your mountain vacation!");	
		}
			else if(type.equals("Mountain") && budget >= 30) {	
				System.out.println("You can choose destination outside Bulgaria for your mountain vacation!");	
			}
			else {
				System.out.println("No information for this type of vacation!");	
			}
			
	}
	}
		