public class DataType{
	public static void main(String[] args){
		//Integers type (byte,short,int,long)
		
		byte age = 50;
		System.out.printf("Your age is %d%n",age);
		
		short quantity = 32000;
		System.out.printf("I bought %d quantity of bags for my business%n",quantity);
		
		int populationInNigeria = 100000000;
		System.out.printf("The total population in Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("The world population is %d%n",worldPopulation);
		
		//float-point type(float,double)
		float myBalance = 12345.8585999F;
		System.out.printf("Your account balance is %.3f%n",myBalance);
		
		double cbnReserve = 5575857.737367636363;
		System.out.printf("The CBN balance is %.5f%n",cbnReserve);
		
		//Boolean type(boolean)
		boolean isJavaFun = true;
		System.out.printf("Is Java a fun language? %b%n",isJavaFun);
		
		//Character type(char)
		char alpha = '@';
		System.out.printf("My email is patrickknowledge4%cgmail.com%n",alpha);
	}
}