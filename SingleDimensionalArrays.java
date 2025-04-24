public class SingleDimensionalArrays{
	public static void main(String[] args){
		int[] numbers = {17,15,18,29,14};
		
		String[] names = {"John","Mark","Precious","Nelly","Patience"};
		
		for(int i = 0; i < 5; i++){
			System.out.printf("%s is %d years old %n",names[i],numbers[i]);
		}
	}
}