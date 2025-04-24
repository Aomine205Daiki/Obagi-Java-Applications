import java.util.Arrays;

public class DeepToStringMethod {
    public static void main(String[] args) {
        // 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print 2D array using deepToString
        System.out.println("2D Array: " + Arrays.deepToString(matrix));
    }
}
