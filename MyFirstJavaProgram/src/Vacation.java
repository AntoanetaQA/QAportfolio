//Control flow statement
//5. Write a program which advices the user where to go to a vacation based on the type of the vacation and the budget. There
//should be two options – Beach, Mountain. If the user put a different value then the program should print a message that there is
//no information about this type of vacation. Budgets are considered per day per person. If the budget per day for Beach type
//vacation is smaller than 50 then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria. If the budget
//per day for Mountain type vacation is smaller than 30 then the program should advise Bulgaria as a destination, otherwise
//Outside Bulgaria. 

	import java.util.Scanner;

	public class Vacation {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter type of the vacation: Beach or Mountain");
			String type = sc.nextLine();
			double budget = 0;
			
			if (type.equals("Beach") || type.equals("Mountain")) {
			System.out.println("Enter your budget: ");	
			budget = sc.nextDouble();
			}
			else {
			System.out.println("No information for this type of vacation!");	
			}
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
			
		}
	}
		