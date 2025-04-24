import java.util.Arrays;

public class FillMethod {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

        Arrays.fill(numbers, 7);

        System.out.println("Filled array: " + Arrays.toString(numbers));
    }
}
