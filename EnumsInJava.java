public class EnumsInJava{
	public static void main(String[] args){
		AccountType type = AccountType.SAVINGS;
		
		switch(type){
			case SAVINGS:
			{
				System.out.println("Your savings account has been created with an interest rate of 2.5%");
			}
			break;
			
			case CHECKING:
			{
				System.out.println("Your checkings account has been created with 0.0% interest rate");
			}
			break;
			
			case FIXED_DEPOSIT:
			{
				System.out.println("Your fixed_deposit account has been created with an interest rate of 5%");
			}
			break;
		}	
	}
}