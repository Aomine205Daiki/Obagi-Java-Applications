public class SumEvenCountOdd{
	public static void main(String[] args){

		int oddNum = 0;
		int[][] numbers = {
						{31,15,20,16},
						{45,12,34,35},
						{18,17,54,28},
						};
			int sum = 0;
			for(int row = 0; row < 3; row++){
				for(int col = 0; col < 4; col++){
					if(numbers[row][col] % 2 == 0){
						sum += numbers[row][col];
					}
					else{
						oddNum++;
					}
				}
			}
			System.out.printf("The sum of all the even numbers is %d%n",sum);
			System.out.printf("The amount of odd numbers is %d%n",oddNum);
	}
}