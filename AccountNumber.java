import java.util.Random;

public class AccountNumber{
	public static void main(String[] args){
		Random ran = new Random();
		
		long number= ran.nextLong(9_999_999_999L);
		System.out.printf("The integer is %d%n",number);
	}
}