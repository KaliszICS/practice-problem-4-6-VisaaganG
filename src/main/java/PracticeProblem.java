import java.util.Scanner;


public class PracticeProblem {

public static int intChecker() {
Scanner input = new Scanner(System.in);

		int num;
		System.out.print("Input an integer: ");
		
		while (!(input.hasNextInt())) { 
			input.nextLine(); 
			System.out.println("That was not a number!");
			System.out.print("Input an integer: ");
		}
		num = input.nextInt();
		return num;
	}
public static double doubleChecker() {		
Scanner input = new Scanner(System.in);

		double num;
		System.out.print("Input a number: ");
		
		while (!(input.hasNextDouble())) { 
			input.nextLine(); 
			System.out.println("That was not a number!");
			System.out.print("Input a number: ");
		}
		num = input.nextDouble();
		return num;
	}
public static boolean booleanChecker() {
Scanner input = new Scanner(System.in);

	boolean bool;
		System.out.print("Input a boolean: ");
		
		while (!(input.hasNextBoolean())) { 
			input.nextLine(); 
			System.out.println("That was not a boolean!");
			System.out.print("Input a boolean: ");
		}
		bool = input.nextBoolean();
		return bool;
}
public static boolean multipleIntChecker() {
Scanner input = new Scanner(System.in);
	System.out.println("Input an integer: ");

	for (int i = 1; i < 4; i++) {
		System.out.println("Input an integer: ");

		while (!(input.hasNextInt())) { 
			input.nextLine(); 
			System.out.println("That was not an integer!");
			System.out.print("Input an integer: ");
		}
	input.nextInt();
	}
	return true;
}

}

