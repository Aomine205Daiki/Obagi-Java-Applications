import java.util.Scanner;

public class SumDifference{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int sumOf6-9 = 0;
		int sumOf4-10 = 0;
		int difference;
		
		for(int i = 1; i <= 10; i++){
			System.out.printf("Enter num%d: ",i);
			int num = input.nextInt();
			
			if(i >= 6 && i <= 9){
				sumOf6-9+= num;
			}
				
			if(i >= 4 && i <= 10){
				sumOf4-10 += num;
			}
		}
		difference = sumOf4-10 - sumOf6-9;
			
		System.out.printf("The answer is %d%n",difference);
	}
}	