// a) State that a program will calculate the product of three integers.
public class ProductCalculator {
	public static void main(String[] args){
		// b) Create a Scanner called input that reads values from the standard input
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		// c) Declare the variables x,y,z and result to be of type int.
		int x, y, z, result;
		
		// e) Read the first integer from the user and dtore it in the variable x.
		x = input.nextInt();
		
		// f) Prompt the user to enter the second integer.
		System.out.print("Enter the second integer: ");
		
		// g) Read the second integer from the user and store it in the variable y.
		y = input.nextInt();
		
		// h) Prompt the user to enter the third integer.
		System.out.print("Enter the third integer: ");
		
		// i) Read the third integer from the user and store it in the variable z.
		z = input.nextInt();
		
		// j) Compute the product of the three integers contained in variables x,y, and z, and assign the result to the variable result.
		result = x * y * z;
		
		// k) Use System.out.print to display the message "Product is" followed by the value of the variable result.
		System.out.println("Product is " + result);
		
		// Close the scanner
		input.close();
	}
}