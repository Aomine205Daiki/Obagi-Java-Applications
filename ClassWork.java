import java.util.Scanner;

public class ClassWork{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		int sum = 0;
		
		for(int i = 1; i <= 10; i++){
			System.out.printf("Enter num%d: ",i);
			int num = input.nextInt();
			
			for(i = 6; i <= 9; i++){
				sum1 += num;
			}
				
			for(i = 4; i <= 10; i++){
				sum2 += num;
			}
			
			sum = sum2 - sum1;
			
			System.out.printf("The answer is %d%n",sum);
		}
	}
}	