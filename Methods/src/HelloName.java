
public class HelloName {

	public static void main(String[] args) {
		hello("Elitsa"); 
		hello("Misho", "Sofia"); 
		hello("Ani", 34);

		}

	public static void hello (String name) {
		System.out.println("Hello " + name + "!");
	}

	public static void hello (String name, String town) {
		System.out.println("Hello " + name + "!" + " You are in " + town + ".");

	}

	public static void hello (String name, int age) {
		System.out.println("Hello " + name + "!" + " You are " + age + " years old.");

	}
}	



	
