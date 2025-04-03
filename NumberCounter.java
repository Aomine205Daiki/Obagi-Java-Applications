import java.util.Scanner;

public class NumberCounter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int negNum = 0;
		int posNum = 0;
		int zeroNum = 0;
		
		for(int i = 1;i <= 10;i++){
			System.out.printf("Enter num%d: ",i);
			int num = input.nextInt();
			
			if(num < 0){
				negNum++;
			}
			if(num > 0){
				posNum++;
			}
			if(num < 1 && num > -1){
				zeroNum++;
			}
		}
		System.out.printf("The amount of negative numbers is %d%n",negNum);
		System.out.printf("The amount of positive numbers is %d%n",posNum);
		System.out.printf("The amount of zero number is %d%n",zeroNum);
	}
}