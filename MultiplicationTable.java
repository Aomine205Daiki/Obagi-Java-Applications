import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter num: ");
		int num = input.nextInt();
		
		System.out.println("The Multiplication Table of " + num);
		
		int i = 1;
		while(i <= 12){
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		}
	}
}