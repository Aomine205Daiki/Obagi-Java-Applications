
import java.util.Scanner; 

public class Program {
	public static void main(String[] args){
		// a) Declare variables
		int c, thisIsAVariable, q76354, number;

		// b) Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		
		// c) Input an integer and assign the result to int variable values
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		
		// d) Print "This is a Java program" on one line
		System.out.println("This is a Java program");
		
		// e) Print "This is a Java program" on two lines using printf
		System.out.printf("This is a Java%nprogram%n");
		
		// f) Check if the variable number is not equal to 7
		if (number != 7) {
			System.out.println("The variable number is not equal to 7");
		}
		input.close(); // close scanner object
	}
}