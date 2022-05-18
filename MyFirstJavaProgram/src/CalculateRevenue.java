//Control flow statements
//3. Write a Java program to calculate the revenue from a sale based on the unit price 
//and quantity of a product input by the user. The discount rate is 15% for the quantity 
//purchased between 100 and 120 units, and 20% for the quantity purchased greater than
//120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. 
//See the example output as shown below:
//Enter unit price: 25
//The revenue from sale: 2337.5$
//After discount: 412.5$(15.0%)

	import java.util.Scanner;

	public class CalculateRevenue {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter unit price: ");
			double prc = sc.nextInt();
			System.out.println("Enter quantity: ");
			int qty = sc.nextInt();
			double disc = 0;
			double surch = 0;
			double rev = 0;
			if(qty < 100) {
				disc = 0;
				rev = prc * qty;
				System.out.println("The revenue from sale: " + rev);
				System.out.println("Discount " + disc);
			} 
			else if (qty >= 100 && qty <= 120) {
				disc = 15;
				rev = 0.85 * prc * qty;
				surch = 0.15 * prc * qty;
				System.out.println("The revenue from sale: " + rev);
				System.out.println("Discount: " + surch  + "(15%)");
			}
			else if (qty > 120) {
				disc = 20;
				rev = 0.8 * prc * qty;
				surch = 0.20 * prc * qty;
				System.out.println("The revenue from sale: " + rev);
				System.out.println("Discount: " + surch  + "(20%)");
			}
		}

	}